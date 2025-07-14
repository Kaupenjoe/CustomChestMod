package net.kaupenjoe.chestmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.kaupenjoe.chestmod.block.ModBlocks;
import net.kaupenjoe.chestmod.block.entity.ModBlockEntities;
import net.kaupenjoe.chestmod.block.entity.renderer.ModChestBlockEntityRenderer;
import net.kaupenjoe.chestmod.block.entity.renderer.ModChestBlockItemRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class ChestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlockEntities.CUSTOM_CHEST, ModChestBlockEntityRenderer::new);

        BuiltinItemRendererRegistry.INSTANCE.register(
                ModBlocks.CUSTOM_CHEST.asItem(), new ModChestBlockItemRenderer());
    }
}
