package lv.starstranger;

import lv.starstranger.block.ModBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.loader.api.FabricLoader;
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
		LOGGER.info("-=* Amazing Flowers *=-");

		ModBlocks.initialize();

		if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
			//add block transparency
			BlockRenderLayerMap.putBlock(ModBlocks.COSMIC_FLOWER, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.TARAXACUM, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.BLUEBELLS, BlockRenderLayer.CUTOUT);

			BlockRenderLayerMap.putBlock(ModBlocks.ANEMONE_PINK, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.ANEMONE_WHITE, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.ANEMONE_RED, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.ANEMONE_PURPLE, BlockRenderLayer.CUTOUT);

			BlockRenderLayerMap.putBlock(ModBlocks.CROCUS_PINK, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.CROCUS_PURPLE, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.CROCUS_WHITE, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.CROCUS_YELLOW, BlockRenderLayer.CUTOUT);

			BlockRenderLayerMap.putBlock(ModBlocks.POTTED_COSMIC_FLOWER, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.POTTED_TARAXACUM, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.POTTED_BLUEBELLS, BlockRenderLayer.CUTOUT);

			BlockRenderLayerMap.putBlock(ModBlocks.DIGITALIS_PURPUREA_RUBY, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.DIGITALIS_PURPUREA_PURPLE, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.DELPHINIUM, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.JOE_PYE_WEED, BlockRenderLayer.CUTOUT);

			BlockRenderLayerMap.putBlock(ModBlocks.WHITEROSE_BUSH, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.YELLOWROSE_BUSH, BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(ModBlocks.PURPLEROSE_BUSH, BlockRenderLayer.CUTOUT);
		}



	}

}