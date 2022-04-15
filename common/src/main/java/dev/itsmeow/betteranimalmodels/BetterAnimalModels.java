package dev.itsmeow.betteranimalmodels;

import org.apache.logging.log4j.LogManager;

public class BetterAnimalModels {

    public static final String MODID = "betteranimalmodels";

    public static void printServerWarning() {
        LogManager.getLogger().warn("Better Animal Models is a clientside mod! It does nothing when installed on dedicated servers, and can be safely removed without any issues.");
    }

}