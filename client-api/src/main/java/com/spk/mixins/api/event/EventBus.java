package com.spk.mixins.api.event;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Custom high-performance thread-safe EventBus system for client events.
 */
public class EventBus {

    private static class RegisteredSubscriber {
        final Object listener;
        final Method method;
        final int priority;

        RegisteredSubscriber(Object listener, Method method, int priority) {
            this.listener = listener;
            this.method = method;
            this.priority = priority;
        }

        void invoke(Event event) {
            try {
                method.setAccessible(true);
                method.invoke(listener, event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private final Map<Class<?>, List<RegisteredSubscriber>> subscribers = new ConcurrentHashMap<>();

    public void register(Object listener) {
        for (Method method : listener.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Subscribe.class)) {
                Class<?>[] params = method.getParameterTypes();
                if (params.length == 1 && Event.class.isAssignableFrom(params[0])) {
                    Class<?> eventType = params[0];
                    Subscribe sub = method.getAnnotation(Subscribe.class);
                    RegisteredSubscriber subscriber = new RegisteredSubscriber(listener, method, sub.priority());
                    
                    subscribers.computeIfAbsent(eventType, k -> new CopyOnWriteArrayList<>()).add(subscriber);
                    subscribers.get(eventType).sort(Comparator.comparingInt((RegisteredSubscriber s) -> s.priority).reversed());
                }
            }
        }
    }

    public void unregister(Object listener) {
        for (List<RegisteredSubscriber> list : subscribers.values()) {
            list.removeIf(sub -> sub.listener == listener);
        }
    }

    public void post(Event event) {
        List<RegisteredSubscriber> list = subscribers.get(event.getClass());
        if (list != null) {
            for (RegisteredSubscriber subscriber : list) {
                subscriber.invoke(event);
                if (event.isCancelled()) {
                    break;
                }
            }
        }
    }
}
