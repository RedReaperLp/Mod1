package com.github.redreaperlp.mod1.villagers;

import com.github.redreaperlp.mod1.Mod1;
import com.github.redreaperlp.mod1.blocks.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

import static com.github.redreaperlp.mod1.Mod1.MOD_ID;
import static com.github.redreaperlp.mod1.blocks.ModBlocks.RUBY_LAMP;

public class ModVillagers {

    public static PointOfInterestType Jumpy_POI = registerPOI("jumpy_poi", ModBlocks.JUMPY_BLOCK);
    public static VillagerProfession Jump_Master = registerProfession("jump_master",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(MOD_ID, "jumpy_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(MOD_ID, name), 1, 10, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }


    public static void registerVillagers() {
        Mod1.LOGGER.debug("Registering Villagers");
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(Jump_Master, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(RUBY_LAMP, 2),
                    10, 10, 0.1f));
        });
    }

}
