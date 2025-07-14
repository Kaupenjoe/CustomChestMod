package net.kaupenjoe.chestmod.block;

import net.kaupenjoe.chestmod.ChestMod;
import net.kaupenjoe.chestmod.block.custom.ModChestBlock;
import net.kaupenjoe.chestmod.block.entity.ModBlockEntities;
import net.kaupenjoe.chestmod.block.entity.ModChestBlockEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CUSTOM_CHEST = registerBlock("custom_chest",
            new ModChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), () -> ModBlockEntities.CUSTOM_CHEST));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ChestMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ChestMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ChestMod.LOGGER.info("Registering Mod Blocks for " + ChestMod.MOD_ID);
    }
}
