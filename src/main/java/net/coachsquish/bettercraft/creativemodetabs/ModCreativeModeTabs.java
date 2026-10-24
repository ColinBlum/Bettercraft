package net.coachsquish.bettercraft.creativemodetabs;

import net.coachsquish.bettercraft.Bettercraft;
import net.coachsquish.bettercraft.block.*;
import net.coachsquish.bettercraft.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab>  CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Bettercraft.MODID);

    public static final Supplier<CreativeModeTab> BETTERCRAFT_TAB = CREATIVE_MODE_TABS.register("better_craft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.bettercraft.better_craft_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY);
                        output.accept(ModBlocks.RUBY_BLOCK);
                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(ModBlocks.TEST_BLOCK);
                        output.accept(ModItems.RUBY_SWORD);
                        output.accept(ModItems.RUBY_PICKAXE);
                        output.accept(ModItems.RUBY_SHOVEL);
                        output.accept(ModItems.RUBY_AXE);
                        output.accept(ModItems.RUBY_HOE);
                        output.accept(ModItems.RUBY_SPEAR);
                        output.accept(ModItems.RUBY_HELMET);
                        output.accept(ModItems.RUBY_CHESTPLATE);
                        output.accept(ModItems.RUBY_LEGGINGS);
                        output.accept(ModItems.RUBY_BOOTS);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}