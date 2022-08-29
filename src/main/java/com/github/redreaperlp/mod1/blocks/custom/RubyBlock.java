package com.github.redreaperlp.mod1.blocks.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RubyBlock extends Block {
    public RubyBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("mod1.tooltip.craftingindigrend"));
        } else {
            tooltip.add(Text.translatable("mod1.tooltip.shift"));
        }


        super.appendTooltip(stack, world, tooltip, options);
    }
}
