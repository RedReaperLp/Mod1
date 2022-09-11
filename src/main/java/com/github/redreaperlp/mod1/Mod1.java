package com.github.redreaperlp.mod1;

import com.github.redreaperlp.mod1.blocks.ModBlocks;
import com.github.redreaperlp.mod1.items.ModItems;
import net.fabricmc.api.ModInitializer;

public class Mod1 implements ModInitializer {

    public static final String MOD_ID = "mod1";



    ModBlocks modBlocks = new ModBlocks();
    ModItems modItems = new ModItems();

    @Override
    public void onInitialize() {

        modBlocks.registerBlocks();
        modItems.registerItems();
    }

}
