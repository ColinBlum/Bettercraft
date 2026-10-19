package net.coachsquish.bettercraft.datagen;

import net.coachsquish.bettercraft.Bettercraft;
import net.coachsquish.bettercraft.item.ModItems;
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

    }
}