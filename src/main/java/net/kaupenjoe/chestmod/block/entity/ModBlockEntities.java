package net.kaupenjoe.chestmod.block.entity;

import net.kaupenjoe.chestmod.ChestMod;
import net.kaupenjoe.chestmod.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<ModChestBlockEntity> CUSTOM_CHEST =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(ChestMod.MOD_ID, "custom_chest"),
                    BlockEntityType.Builder.create(ModChestBlockEntity::new, ModBlocks.CUSTOM_CHEST).build(null));


    public static void registerBlockEntities() {
        ChestMod.LOGGER.info("Registering Block Entities for " + ChestMod.MOD_ID);
    }
}
