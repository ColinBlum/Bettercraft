package net.coachsquish.bettercraft.item;

import net.coachsquish.bettercraft.Bettercraft;
import net.coachsquish.bettercraft.Bettercraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Consumer;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Bettercraft.MODID);

    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");

    public static final DeferredItem<Item> RUBY_SWORD = ITEMS.registerItem("ruby_sword",
            properties -> new Item(properties.sword(ModToolTiers.RUBY,3,-2.4f)));
    public static final DeferredItem<Item> RUBY_PICKAXE = ITEMS.registerItem("ruby_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolTiers.RUBY,1,-2.8f)));
    public static final DeferredItem<Item> RUBY_SHOVEL = ITEMS.registerItem("ruby_shovel",
            properties -> new ShovelItem(ModToolTiers.RUBY,1.5f,-3.0f, properties));
    public static final DeferredItem<Item> RUBY_AXE = ITEMS.registerItem("ruby_axe",
            properties -> new AxeItem(ModToolTiers.RUBY,5,-3.0f, properties));
    public static final DeferredItem<Item> RUBY_HOE = ITEMS.registerItem("ruby_hoe",
            properties -> new HoeItem(ModToolTiers.RUBY,-5f,0f, properties));
    public static final DeferredItem<Item> RUBY_SPEAR = ITEMS.registerItem("ruby_spear",
            properties -> new Item(properties.spear(ModToolTiers.RUBY,
                    1.2f,1.33f, 0.35f, 2f, 8f,
                    4.5f, 5.1f, 7.5f, 4.67f)));
    public static final DeferredItem<Item> RUBY_HELMET = ITEMS.registerItem("ruby_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterial.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> RUBY_CHESTPLATE = ITEMS.registerItem("ruby_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterial.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> RUBY_LEGGINGS = ITEMS.registerItem("ruby_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterial.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> RUBY_BOOTS = ITEMS.registerItem("ruby_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterial.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}