package com.github.redreaperlp.mod1.blocks.custom;

import com.github.redreaperlp.mod1.blocks.ModBlocks;
import com.github.redreaperlp.mod1.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class RubyCropBlock extends CropBlock {

    public static final IntProperty AGE = IntProperty.of("age", 0, 3);

    public static final Item RUBY_SEEDS = ModItems.RUBY_SEEDS;

    public RubyCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return RUBY_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }


    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
