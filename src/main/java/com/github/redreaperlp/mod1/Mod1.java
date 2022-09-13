package com.github.redreaperlp.mod1;

import com.github.redreaperlp.mod1.blocks.ModBlocks;
import com.github.redreaperlp.mod1.items.ModItems;
import com.github.redreaperlp.mod1.villagers.ModVillagers;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterest;
import net.minecraft.world.poi.PointOfInterestType;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Mod1 implements ModInitializer {

    public static final String MOD_ID = "mod1";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



    public PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(MOD_ID, name), 1,10, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }



    @Override
    public void onInitialize() {
        ModItems modItems = new ModItems();
        ModBlocks modBlocks = new ModBlocks();
        ModVillagers modVillagers = new ModVillagers();

    }

}
