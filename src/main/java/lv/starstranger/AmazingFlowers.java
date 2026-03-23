package lv.starstranger;

import lv.starstranger.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.block.BlockRenderType;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmazingFlowers implements ModInitializer {
	public static final String MOD_ID = "amazing-flowers";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		ModBlocks.initialize();

		BlockRenderLayerMap.putBlock(ModBlocks.COSMIC_FLOWER, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(ModBlocks.TARAXACUM, BlockRenderLayer.CUTOUT);
		//BlockRenderLayerMap.putBlock(ModBlocks.POTTED_COSMIC_FLOWER, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(ModBlocks.DIGITALIS_PURPUREA, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(ModBlocks.WHITEROSE_BUSH, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(ModBlocks.YELLOWROSE_BUSH, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(ModBlocks.PURPLEROSE_BUSH, BlockRenderLayer.CUTOUT);
	}

}