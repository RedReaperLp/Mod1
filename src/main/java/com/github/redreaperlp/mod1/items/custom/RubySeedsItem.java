package com.github.redreaperlp.mod1.items.custom;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class RubySeedsItem extends BlockItem {


    public RubySeedsItem(Block block, Item.Settings settings) {
        super(block, settings);
    }

    @Override
    public String getTranslationKey() {
        return this.getOrCreateTranslationKey();
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        if (!Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("mod1.tooltip.shift"));
        } else {
            tooltip.add(Text.translatable("mod1.tooltip.seedt1.info"));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
