package com.github.redreaperlp.mod1.blocks;

import com.github.redreaperlp.mod1.blocks.custom.JumpyBlock;
import com.github.redreaperlp.mod1.blocks.custom.RubyBlock;
import com.github.redreaperlp.mod1.blocks.custom.RubyCropBlock;
import com.github.redreaperlp.mod1.blocks.custom.RubyLamp;
import com.github.redreaperlp.mod1.items.ItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.redreaperlp.mod1.Mod1.MOD_ID;

public class ModBlocks {

    public final Block RUBY_BLOCK = registerBlocks("ruby_block",
            new RubyBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f, 6.0f).requiresTool().luminance(15)), ItemGroupBuilder.MODItemGroup);

    public final Block RUBY_ORE = registerBlocks("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ItemGroupBuilder.MODItemGroup);

    public final Block RUBY_ORE_DEEPSLATE = registerBlocks("ruby_ore_deepslate",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f, 3.0f).requiresTool()), ItemGroupBuilder.MODItemGroup);

    public final Block RUBY_ORE_NETHER = registerBlocks("ruby_ore_nether",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ItemGroupBuilder.MODItemGroup);

    public final Block RUBY_ORE_END = registerBlocks("ruby_ore_end",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f, 3.0f).requiresTool()), ItemGroupBuilder.MODItemGroup);

    public final Block JUMPY_BLOCK = registerBlocks("jumpy_block",
            new JumpyBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f, 3.0f).requiresTool()), ItemGroupBuilder.MODItemGroup);

    public final Block RUBY_LAMP = registerBlocks("ruby_lamp",
            new RubyLamp(FabricBlockSettings.of(Material.STONE).strength(1.0f, 3.0f).requiresTool()
                    .luminance((state) -> state.get(RubyLamp.LIT) ? 15 : 0)), ItemGroupBuilder.MODItemGroup);

    public static final Block RUBY_CROP = registerBlocksWithoutItem("ruby_crop",
            new RubyCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));




    private static Block registerBlocksWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }
    private Block registerBlocks(String name, Block block, ItemGroup tab) {
        registerBlockItems(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    private Item registerBlockItems(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public void registerBlocks() {
    }
}
