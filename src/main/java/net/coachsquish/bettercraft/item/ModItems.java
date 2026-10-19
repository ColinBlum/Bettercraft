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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}