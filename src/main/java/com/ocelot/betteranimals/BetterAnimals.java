package com.ocelot.betteranimals;

import java.io.File;

import org.apache.logging.log4j.Logger;

import com.ocelot.betteranimals.client.ReplacementHandler;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = BetterAnimals.MODID, value = Side.CLIENT)
@Mod(modid = BetterAnimals.MODID, acceptedMinecraftVersions = "[1.12,1.12.2]", version = BetterAnimals.VERSION, clientSideOnly = true, dependencies = "before:quark@[r1.5-149,);after:sophisticatedwolves|primal|abyssalcraft|brownmooshrooms|midnight")
public class BetterAnimals {

    public static final String MODID = "betteranimals";
    public static final String VERSION = "@VERSION@";

    @Instance(MODID)
    public static BetterAnimals instance;

    private static Logger logger;

    public static Configuration config;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        if(event.getSide() == Side.SERVER) {
            throw new RuntimeException("This is quite literally impossible. I'm afraid of what you've done. This mod does not load on the server, and should not load on the server. What are you doing. Stop. I don't deserve this. -its_meow. Also, report this to me ASAP.");
        }
        logger = event.getModLog();
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "betteranimals.cfg")); 
        BetterAnimalsConfig.readConfig();
        BetterAnimalsConfig.initConfig(config);
        ReplacementHandler.preinit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ReplacementHandler.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ReplacementHandler.postinit();
        if(config.hasChanged()){
            config.save();
        }
    }
    
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void mre(ModelRegistryEvent e) {
        ReplacementHandler.mre();
    }

    public static Logger logger() {
        return logger;
    }
}