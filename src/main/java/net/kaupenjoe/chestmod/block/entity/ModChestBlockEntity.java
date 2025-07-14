package net.kaupenjoe.chestmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.util.math.BlockPos;

public class ModChestBlockEntity extends ChestBlockEntity {
    public ModChestBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.CUSTOM_CHEST, blockPos, blockState);
    }
}
