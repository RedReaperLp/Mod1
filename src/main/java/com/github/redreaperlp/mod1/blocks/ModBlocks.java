package com.github.redreaperlp.mod1.blocks;

import com.github.redreaperlp.mod1.groupBuilder.ItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());
    //Required material defined in "main/recources/data/minecraft/tags/blocks/
    //

    public static ItemStack rubyStack = Registry.ITEM.get(new Identifier("mod1", "ruby_block")).getDefaultStack();//Creating Ruby stack


    public void registerBlocks() {
        {
            Registry.register(Registry.BLOCK, new Identifier("mod1", "ruby_block"), RUBY_BLOCK);
            Registry.register(Registry.ITEM, new Identifier("mod1", "ruby_block"), new BlockItem(RUBY_BLOCK, new FabricItemSettings().group(ItemGroupBuilder.MODItemGroup)));
        } //Registering Ruby block
    }
}
