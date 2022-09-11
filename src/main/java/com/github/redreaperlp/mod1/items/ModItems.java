package com.github.redreaperlp.mod1.items;

import com.github.redreaperlp.mod1.blocks.ModBlocks;
import com.github.redreaperlp.mod1.items.custom.EightBallItem;
import com.github.redreaperlp.mod1.items.custom.RubyItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.redreaperlp.mod1.Mod1.MOD_ID;

public class ModItems {

    ModBlocks modBlocks = new ModBlocks();


    public final Item RUBY = registerItem("ruby",
            new RubyItem(new FabricItemSettings().group(ItemGroupBuilder.MODItemGroup)));

    public final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ItemGroupBuilder.MODItemGroup).maxCount(1)));

    public final Item RUBY_SEEDS = registerItem("ruby_seeds",
            new AliasedBlockItem(modBlocks.RUBY_CROP, new FabricItemSettings().group(ItemGroupBuilder.MODItemGroup)));

    /*
    public final Item RUBY_FOOD = registerItem("ruby_food",
            new Item(new FabricItemSettings().group(ItemGroupBuilder.MODItemGroup).food(new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).build())));

            this is for an foodItem
    */


    public void registerItems() {
    }

    public Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }
}
