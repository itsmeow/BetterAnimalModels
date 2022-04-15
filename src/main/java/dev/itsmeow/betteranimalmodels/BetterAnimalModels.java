package dev.itsmeow.betteranimalmodels;

import org.apache.logging.log4j.LogManager;

import dev.itsmeow.betteranimalmodels.client.ClientEventHandler;
import dev.itsmeow.imdlib.util.ClassLoadHacks;
import net.minecraftforge.fml.common.Mod;

@Mod(BetterAnimalModels.MODID)
public class BetterAnimalModels {

    public static final String MODID = "betteranimalmodels";

    public BetterAnimalModels() {
        ClassLoadHacks.runOnDist(
        () -> ClientEventHandler::construction,
        () -> () -> LogManager.getLogger().warn("Better Animal Models is a clientside mod! It does nothing when installed on dedicated servers, and can be safely removed without any issues."));
    }

}