package net.polathegreat.myfirstfabricmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.polathegreat.myfirstfabricmod.MyFirstFabricMod;

public class ModItems {
    // Creates a new blank item (Pink Garnet)
    public static final Item PINK_GARNET = RegisterItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = RegisterItem("raw_pink_garnet", new Item(new Item.Settings()));

    // Helper method for registering new items.
    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MyFirstFabricMod.MOD_ID, name), item);
    }

    // A method for the main class to call when registering items.
    public static void RegisterModItems() {
        MyFirstFabricMod.LOGGER.info("Registering mod items for " + MyFirstFabricMod.MOD_ID);
    }
}