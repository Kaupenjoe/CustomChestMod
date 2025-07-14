package net.kaupenjoe.chestmod;

import net.fabricmc.api.ModInitializer;

import net.kaupenjoe.chestmod.block.ModBlocks;
import net.kaupenjoe.chestmod.block.entity.ModBlockEntities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChestMod implements ModInitializer {
	public static final String MOD_ID = "chestmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
	}
}
