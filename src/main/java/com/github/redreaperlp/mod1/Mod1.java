package com.github.redreaperlp.mod1;

import com.github.redreaperlp.mod1.blocks.ModBlocks;
import com.github.redreaperlp.mod1.items.ModItems;
import net.fabricmc.api.ModInitializer;

public class Mod1 implements ModInitializer {

    public static final String MOD_ID = "mod1";



    ModItems modItems = new ModItems();
    ModBlocks modBlocks = new ModBlocks();

    @Override
    public void onInitialize() {

        modItems.registerItems();
        modBlocks.registerBlocks();
    }

}
