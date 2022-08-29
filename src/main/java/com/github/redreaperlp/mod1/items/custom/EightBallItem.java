package com.github.redreaperlp.mod1.items.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EightBallItem extends Item {
    public EightBallItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient && hand.equals(Hand.MAIN_HAND)) {
            outputNumber(user);
            user.getItemCooldownManager().set(this, 20 * 1);
        }

        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.mod1.eight_ball.tooltip.info1"));
            tooltip.add(Text.translatable("item.mod1.eight_ball.tooltip.info2"));
        } else {
            tooltip.add(Text.translatable("mod1.tooltip.shift"));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    private void outputNumber(PlayerEntity player) {
        player.sendMessage(Text.literal("§eYour number is:" + randomNumber()));
    }

    private int randomNumber() {
        return Random.createLocal().nextBetween(0, 10);
    }
}
