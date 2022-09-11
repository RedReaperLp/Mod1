package com.github.redreaperlp.mod1.blocks.custom;

import com.github.redreaperlp.mod1.blocks.ModBlocks;
import com.github.redreaperlp.mod1.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class RubyCropBlock extends CropBlock {

    public final IntProperty AGE = IntProperty.of("age", 0, 4);
    ModItems modItems = new ModItems();


    public RubyCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return modItems.RUBY_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return 4;
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
