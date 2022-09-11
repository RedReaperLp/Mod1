package com.github.redreaperlp.mod1.client;

import com.github.redreaperlp.mod1.blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class Mod1Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModBlocks modBlocks = new ModBlocks();
        BlockRenderLayerMap.INSTANCE.putBlock(modBlocks.RUBY_CROP, RenderLayer.getCutout());

    }
}
