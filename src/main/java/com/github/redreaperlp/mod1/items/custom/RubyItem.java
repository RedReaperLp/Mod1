package com.github.redreaperlp.mod1.items.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class RubyItem extends Item {
    public RubyItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("mod1.tooltip.craftingindigrend"));
        } else {
            tooltip.add(Text.translatable("mod1.tooltip.shift"));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
