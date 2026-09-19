/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.q.b;

import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.q.b.a;
import rs.q.b.e;
import rs.q.b.f;

public class d
implements Runnable {
    private static final Logger c = LoggerFactory.getLogger(d.class);
    private AtomicBoolean d;
    public static d a = new d();
    private final DateTimeFormatter e = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
    public static rs.q.a.a.a b = new e();

    public d() {
        this.d = new AtomicBoolean(false);
    }

    @Override
    public void run() {
        c.info("Receiver thread started!");
        a[] aArray = new a[]{null};
        ConcurrentLinkedQueue<Object> concurrentLinkedQueue = new ConcurrentLinkedQueue<Object>();
        ActionListener actionListener = actionEvent -> SwingUtilities.invokeLater(new f(this, aArray, concurrentLinkedQueue));
        Timer timer = new Timer(100, actionListener);
        timer.start();
        String string = " \\| ";
        String string2 = "Login";
        String string3 = "Login request @";
        String string4 = "Logout";
        String string5 = "Unregistered (logout)";
        String string6 = "Could";
        String string7 = "END";
        int n2 = 0;
        Socket socket = null;
        FilterInputStream filterInputStream = null;
        try {
            String string8;
            socket = new Socket(rs.f.a.j, 2456);
            c.info("Connected to the server!");
            filterInputStream = new DataInputStream(socket.getInputStream());
            long l2 = System.currentTimeMillis();
            while (this.d.get() && System.currentTimeMillis() - l2 <= 10000L && !(string8 = ((DataInputStream)filterInputStream).readUTF()).equals("END")) {
                if (string8.startsWith("Could")) {
                    concurrentLinkedQueue.add(string8);
                    break;
                }
                boolean bl = string8.contains("Login");
                if (bl) {
                    ++n2;
                }
                String[] stringArray = string8.split(" \\| ");
                String string9 = this.a(Long.parseLong(stringArray[0]));
                if (bl) {
                    concurrentLinkedQueue.add("[" + string9 + "] #" + n2 + ": " + stringArray[1].replace("Login", "Login request @"));
                    continue;
                }
                concurrentLinkedQueue.add("[" + string9 + "]  " + stringArray[1].replace("Logout", "Unregistered (logout)"));
            }
        }
        catch (UnknownHostException unknownHostException) {
            c.info("Don't know about host " + rs.f.a.j);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (filterInputStream != null) {
            try {
                filterInputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        if (socket != null) {
            try {
                socket.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        actionListener.actionPerformed(null);
        timer.stop();
        this.d.set(false);
        c.info("Receiver has stopped!");
    }

    public void a() {
        this.d.set(true);
        new Thread(this).start();
    }

    public void b() {
        this.d.set(false);
    }

    private String a(long l2) {
        Instant instant = Instant.ofEpochMilli(l2);
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        return localDateTime.format(this.e);
    }

    public AtomicBoolean c() {
        return this.d;
    }
}

