package com.github.redreaperlp.mod1.blocks;

import com.github.redreaperlp.mod1.items.ItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public final Block RUBY_BLOCK = registerBlocks("ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f, 6.0f).requiresTool()), ItemGroupBuilder.MODItemGroup);

    public final Block RUBY_ORE = registerBlocks("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ItemGroupBuilder.MODItemGroup);

    public final Block RUBY_ORE_DEEPSLATE = registerBlocks("ruby_ore_deepslate",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f, 3.0f).requiresTool()), ItemGroupBuilder.MODItemGroup);

    public final Block RUBY_ORE_NETHER = registerBlocks("ruby_ore_nether",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ItemGroupBuilder.MODItemGroup);

    public final Block RUBY_ORE_END = registerBlocks("ruby_ore_end",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f, 3.0f).requiresTool()), ItemGroupBuilder.MODItemGroup);


    private Block registerBlocks(String name, Block block, ItemGroup tab) {
        registerBlockItems(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier("mod1", name), block);
    }

    private Item registerBlockItems(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier("mod1", name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public void registerBlocks() {
    }
}
