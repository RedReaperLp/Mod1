package com.github.redreaperlp.mod1.blocks.custom;

import com.github.redreaperlp.mod1.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class RubyCropBlock extends CropBlock {

    public final IntProperty AGE = IntProperty.of("age", 0, 3);
    ModBlocks modBlocks = new ModBlocks();


    public RubyCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return modBlocks.RUBY_CROP;
    }

    public int getMaxAge() {
        return 3;
    }

    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

}
