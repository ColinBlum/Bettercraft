package net.coachsquish.bettercraft.datagen;

import net.coachsquish.bettercraft.Bettercraft;
import net.coachsquish.bettercraft.block.ModBlocks;
import net.coachsquish.bettercraft.tags.ModTags;
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
                .add(ModBlocks.RUBY_ORE.getKey())
                .add(ModBlocks.TEST_BLOCK.getKey())
        ;

    // RUBY TIER
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.RUBY_BLOCK.getKey())
                .add(ModBlocks.RUBY_ORE.getKey())
        ;

        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);

        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);

        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);

        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);


        tag(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.TEST_BLOCK.getKey())
        ;

        tag(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_RUBY_TOOL)
        ;

        tag(ModTags.Blocks.METALS)
                .add(Blocks.IRON_BLOCK.builtInRegistryHolder().key())
                .add(Blocks.IRON_ORE.builtInRegistryHolder().key())
                .add(Blocks.DEEPSLATE_IRON_ORE.builtInRegistryHolder().key())
                .add(Blocks.RAW_IRON_BLOCK.builtInRegistryHolder().key())
                .add(Blocks.GOLD_BLOCK.builtInRegistryHolder().key())
                .add(Blocks.GOLD_ORE.builtInRegistryHolder().key())
                .add(Blocks.RAW_GOLD_BLOCK.builtInRegistryHolder().key())
                .add(Blocks.DEEPSLATE_GOLD_ORE.builtInRegistryHolder().key())
                .add(Blocks.COPPER_ORE.builtInRegistryHolder().key())
                .add(Blocks.DEEPSLATE_COPPER_ORE.builtInRegistryHolder().key())
                .add(Blocks.RAW_COPPER_BLOCK.builtInRegistryHolder().key())
                .addTag(BlockTags.COPPER)
        ;


    }
}