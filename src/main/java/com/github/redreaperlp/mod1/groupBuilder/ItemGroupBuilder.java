package com.github.redreaperlp.mod1.groupBuilder;

import com.github.redreaperlp.mod1.blocks.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class ItemGroupBuilder {
    public static final ItemGroup MODItemGroup = FabricItemGroupBuilder.build(
            new Identifier("mod1", "mod1"),
            () -> new ItemStack(ModBlocks.rubyStack.getItem()));
}
