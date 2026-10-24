package net.coachsquish.bettercraft.datagen;

import net.coachsquish.bettercraft.Bettercraft;
import net.coachsquish.bettercraft.item.ModItems;
import net.coachsquish.bettercraft.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Bettercraft.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.RUBY_REPAIRABLE)
                .add(ModItems.RUBY.getKey())
        ;

        tag(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD.getKey())
        ;
        tag(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE.getKey())
        ;
        tag(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL.getKey())
        ;
        tag(ItemTags.AXES)
                .add(ModItems.RUBY_AXE.getKey())
        ;
        tag(ItemTags.HOES)
                .add(ModItems.RUBY_HOE.getKey())
        ;
        tag(ItemTags.SPEARS)
                .add(ModItems.RUBY_SPEAR.getKey())
        ;

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.RUBY_HELMET.getKey())
        ;
        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.RUBY_CHESTPLATE.getKey())
        ;
        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.RUBY_LEGGINGS.getKey())
        ;
        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.RUBY_BOOTS.getKey())
        ;
    }
}