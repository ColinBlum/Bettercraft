package net.coachsquish.bettercraft.item;

import com.google.common.collect.Maps;
import net.coachsquish.bettercraft.Bettercraft;
import net.coachsquish.bettercraft.tags.ModTags;
import net.minecraft.core.Registry;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.Map;

public class ModArmorMaterial {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));
    public static final ResourceKey<EquipmentAsset> RUBY_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(Bettercraft.MODID, "ruby"));
    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(40,
            makeDefense(4, 7, 9, 5, 23), 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 4, 0,
            ModTags.Items.RUBY_REPAIRABLE, RUBY_KEY);

    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );
    }
}