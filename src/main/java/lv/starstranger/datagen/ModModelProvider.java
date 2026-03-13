package lv.starstranger.datagen;

import lv.starstranger.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /*blockStateModelGenerator.registerFlowerPotPlantAndItem(
                ModBlocks.COSMIC_FLOWER,
                ModBlocks.TARAXACUM,
                BlockStateModelGenerator.CrossType.NOT_TINTED
        );*/

        blockStateModelGenerator.registerFlowerPotPlant(
                ModBlocks.COSMIC_FLOWER,
                ModBlocks.POTTED_COSMIC_FLOWER,
                BlockStateModelGenerator.CrossType.NOT_TINTED
        );

        blockStateModelGenerator.registerFlowerPotPlant(
                ModBlocks.TARAXACUM,
                ModBlocks.POTTED_TARAXACUM,
                BlockStateModelGenerator.CrossType.NOT_TINTED
        );

        //blockStateModelGenerator.registerSingleton(ModBlocks.COSMIC_FLOWER, TexturedModel.);
        //blockStateModelGenerator.registerSingleton(ModBlocks.TARAXACUM, Models.CROSS);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModBlocks.COSMIC_FLOWER.asItem(), Models.GENERATED);
    }

    @Override
    public String getName() {
        return "FabricDocsReference Model Provider";
    }
}