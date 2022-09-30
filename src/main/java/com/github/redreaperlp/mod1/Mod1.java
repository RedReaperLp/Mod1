package com.github.redreaperlp.mod1;

import com.github.redreaperlp.mod1.blocks.ModBlocks;
import com.github.redreaperlp.mod1.items.ModItems;
import com.github.redreaperlp.mod1.villagers.ModVillagers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod1 implements ModInitializer {

    public static final String MOD_ID = "mod1";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlockss();

        ModVillagers.registerVillagers();
        ModVillagers.registerTrades();

    }

}
