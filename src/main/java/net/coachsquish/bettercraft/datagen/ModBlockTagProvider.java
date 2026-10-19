package net.coachsquish.bettercraft.datagen;

import net.coachsquish.bettercraft.Bettercraft;
import net.coachsquish.bettercraft.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {


    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Bettercraft.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_BLOCK.getKey())
        ;

        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.RUBY_BLOCK.getKey())
        ;

//        tag(ModTags.Blocks.METALS)
//                .add(Blocks.IRON_BLOCK.builtInRegistryHolder().key())
//                .add(Blocks.IRON_ORE.builtInRegistryHolder().key())
//                .add(Blocks.DEEPSLATE_IRON_ORE.builtInRegistryHolder().key())
//                .add(Blocks.RAW_IRON_BLOCK.builtInRegistryHolder().key())
//                .add(Blocks.GOLD_BLOCK.builtInRegistryHolder().key())
//                .add(Blocks.GOLD_ORE.builtInRegistryHolder().key())
//                .add(Blocks.RAW_GOLD_BLOCK.builtInRegistryHolder().key())
//                .add(Blocks.DEEPSLATE_GOLD_ORE.builtInRegistryHolder().key())
//                .add(Blocks.COPPER_ORE.builtInRegistryHolder().key())
//                .add(Blocks.DEEPSLATE_COPPER_ORE.builtInRegistryHolder().key())
//                .add(Blocks.RAW_COPPER_BLOCK.builtInRegistryHolder().key())
//                .addTag(BlockTags.COPPER)
//        ;


    }
}