package com.ocelot.betteranimals;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.ocelot.betteranimals.client.ReplacementHandler;

public class BetterAnimalsConfig {

    public static final Logger LOG = LogManager.getLogger();

    private static final Type TYPE = new TypeToken<Map<String, Map<String, Boolean>>>() {
    }.getType();

    @SuppressWarnings("resource") // this should not be needed
    public static OverridesConfiguration load(File location) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonReader reader = new JsonReader(new FileReader(location));
            OverridesConfiguration cfg = new OverridesConfiguration(gson.fromJson(reader, TYPE));
            reader.close(); // for some reason this doesn't stop the stupid warning
            return cfg;
        } catch(IOException e) {
            e.printStackTrace();
        } catch(JsonSyntaxException e) {
            System.out.println("Misconfigured configuration in file: " + location.getAbsolutePath());
            throw e;
        }
        return null;
    }

    public static void genDefault(File location) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Map<String, Map<String, Boolean>> configMap = new HashMap<String, Map<String, Boolean>>();
        ReplacementHandler.replaceDefs.values().forEach(m -> m.keySet().forEach(pair -> {
            configMap.putIfAbsent(pair.getLeft(), new HashMap<String, Boolean>());
            configMap.get(pair.getLeft()).put(pair.getRight(), true);
        }));
        try (Writer writer = new FileWriter(location)) {
            gson.toJson(configMap, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class OverridesConfiguration {
        public final Map<String, Map<String, Boolean>> mods;

        public OverridesConfiguration(Map<String, Map<String, Boolean>> mods) {
            this.mods = mods;
        }
    }

}
