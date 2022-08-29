package com.github.redreaperlp.mod1.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ItemGroupBuilder.MODItemGroup)));



    public void registerItems() {
    }

    public Item registerItem( String name,Item item) {
        return Registry.register(Registry.ITEM, new Identifier("mod1", name), item);
    }
}
