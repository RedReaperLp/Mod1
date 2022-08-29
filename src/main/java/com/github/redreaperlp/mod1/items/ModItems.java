package com.github.redreaperlp.mod1.items;

import com.github.redreaperlp.mod1.groupBuilder.ItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public final Item RUBY = new Item(new FabricItemSettings().group(ItemGroupBuilder.MODItemGroup));

    public void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("mod1", "ruby"), RUBY);

    }
}
