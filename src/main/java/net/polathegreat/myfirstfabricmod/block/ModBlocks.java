package net.polathegreat.myfirstfabricmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.polathegreat.myfirstfabricmod.MyFirstFabricMod;

public class ModBlocks {
    // Register a new block
    public static final Block PINK_GARNET_BLOCK = RegisterBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RAW_PINK_GARNET_BLOCK = RegisterBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.0f)
                    .requiresTool()));

    // Helper method for registering an actual block.
    private static Block RegisterBlock(String name, Block block) {
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MyFirstFabricMod.MOD_ID, name), block);
    }

    // Helper method for registering the item version of a block.
    private static void RegisterBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MyFirstFabricMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    // A method for the main class to call when registering blocks.
    public static void RegisterModBlocks() {
        MyFirstFabricMod.LOGGER.info("Registering mod blocks for " + MyFirstFabricMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PINK_GARNET_BLOCK);
            entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
        });
    }
}
