package dev.itsmeow.betteranimals;

import org.apache.logging.log4j.LogManager;

import dev.itsmeow.betteranimals.client.ClientEventHandler;
import dev.itsmeow.imdlib.util.ClassLoadHacks;
import net.minecraftforge.fml.common.Mod;

@Mod(BetterAnimals.MODID)
public class BetterAnimals {

    public static final String MODID = "betteranimals";

    public BetterAnimals() {
        ClassLoadHacks.runOnDist(
        () -> ClientEventHandler::construction,
        () -> () -> LogManager.getLogger().warn("Better Animal Models is a clientside mod! It does nothing when installed on dedicated servers, and can be safely removed without any issues."));
    }

}