package com.github.redreaperlp.mod1.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.redreaperlp.mod1.Mod1.MOD_ID;


public class ItemGroupBuilder {
    public static final ItemGroup MODItemGroup = FabricItemGroupBuilder.build(
            new Identifier("mod1", "general"),
            () -> new ItemStack(Registry.ITEM.get(new Identifier(MOD_ID, "ruby_block"))));

}
