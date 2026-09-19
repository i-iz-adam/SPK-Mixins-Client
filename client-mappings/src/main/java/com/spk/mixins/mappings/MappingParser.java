package com.spk.mixins.mappings;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Loads JSON / TSRG mapping files and converts them into a MappingSet.
 */
public class MappingParser {

    public static MappingSet parseJson(InputStream stream) {
        MappingSet mappings = new MappingSet();
        Gson gson = new Gson();
        JsonObject root = gson.fromJson(new InputStreamReader(stream, StandardCharsets.UTF_8), JsonObject.class);

        if (root.has("classes")) {
            JsonArray classes = root.getAsJsonArray("classes");
            classes.forEach(element -> {
                JsonObject cls = element.getAsJsonObject();
                String obf = cls.get("obfuscated").getAsString();
                String named = cls.get("named").getAsString();
                mappings.addClassMapping(obf, named);

                if (cls.has("fields")) {
                    cls.getAsJsonArray("fields").forEach(f -> {
                        JsonObject field = f.getAsJsonObject();
                        mappings.addFieldMapping(obf, field.get("obfuscated").getAsString(), named, field.get("named").getAsString());
                    });
                }

                if (cls.has("methods")) {
                    cls.getAsJsonArray("methods").forEach(m -> {
                        JsonObject method = m.getAsJsonObject();
                        mappings.addMethodMapping(
                            obf, 
                            method.get("obfuscated").getAsString(), 
                            method.has("descriptor") ? method.get("descriptor").getAsString() : "", 
                            named, 
                            method.get("named").getAsString()
                        );
                    });
                }
            });
        }

        if (root.has("accessTransformers")) {
            root.getAsJsonArray("accessTransformers").forEach(element -> {
                JsonObject at = element.getAsJsonObject();
                String targetClass = at.get("class").getAsString();
                String member = at.has("member") ? at.get("member").getAsString() : "";
                String desc = at.has("descriptor") ? at.get("descriptor").getAsString() : "";
                String accessStr = at.get("access").getAsString();
                AccessTransformer.AccessLevel level = AccessTransformer.AccessLevel.valueOf(accessStr.toUpperCase());
                boolean removeFinal = at.has("removeFinal") && at.get("removeFinal").getAsBoolean();

                mappings.addAccessTransformer(new AccessTransformer(targetClass, member, desc, level, removeFinal));
            });
        }

        return mappings;
    }
}
