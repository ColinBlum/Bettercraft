package net.coachsquish.bettercraft.datagen;

import net.coachsquish.bettercraft.Bettercraft;
import net.coachsquish.bettercraft.block.ModBlocks;
import net.coachsquish.bettercraft.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "Bettercraft Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY))
                .group("ruby_block")
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK)
                .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK.get()), has(ModBlocks.RUBY_BLOCK))
                .group("ruby")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("B")
                .define('A', ModItems.RUBY).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ruby_sword")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE.get())
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', ModItems.RUBY).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ruby_pickaxe")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL.get())
                .pattern("A")
                .pattern("B")
                .pattern("B")
                .define('A', ModItems.RUBY).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ruby_shovel")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.RUBY_AXE.get())
                .pattern("AA")
                .pattern("BA")
                .pattern("B ")
                .define('A', ModItems.RUBY).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ruby_axe")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.RUBY_HOE.get())
                .pattern("AA")
                .pattern("B ")
                .pattern("B ")
                .define('A', ModItems.RUBY).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ruby_hoe")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_SPEAR.get())
                .pattern("  A")
                .pattern(" B ")
                .pattern("B  ")
                .define('A', ModItems.RUBY).define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ruby_spear")
                .save(output);


    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
                                                                RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result,
                                                                float experience, int cookingTime, String group, String fromDesc) {
        for(ItemLike itemlike : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(output, Bettercraft.MODID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
        }
    }
}