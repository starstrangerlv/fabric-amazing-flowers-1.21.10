package lv.starstranger.datagen;

import com.google.gson.JsonObject;
import lv.starstranger.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;
import net.minecraft.util.Identifier;

import java.util.Map;
import java.util.Optional;

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

        /*blockStateModelGenerator.registerFlowerPotPlant(
                ModBlocks.COSMIC_FLOWER,
                ModBlocks.POTTED_COSMIC_FLOWER,
                BlockStateModelGenerator.CrossType.NOT_TINTED
        );*/



        blockStateModelGenerator.registerFlowerPotPlant(
                ModBlocks.TARAXACUM,
                ModBlocks.POTTED_TARAXACUM,
                BlockStateModelGenerator.CrossType.NOT_TINTED
        );


        /*blockStateModelGenerator.registerDoubleBlock(
                ModBlocks.YELLOWROSE_BUSH,
                BlockStateModelGenerator.CrossType.NOT_TINTED
        );*/

        //blockStateModelGenerator.registerSingleton(ModBlocks.COSMIC_FLOWER, TexturedModel.);
        //blockStateModelGenerator.registerSingleton(ModBlocks.TARAXACUM, Models.CROSS);

        // 1. Define the 4 different models (using the 'cross' parent for flowers)
        // This creates the .json model files in assets/modid/models/block/


    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModBlocks.COSMIC_FLOWER.asItem(), Models.GENERATED);


        //


        /*
        itemModelGenerator.register(
                ModBlocks.YELLOWROSE_BUSH.asItem(),
                new Model(Optional.of(Identifier.of("amazing-flowers", "item/yellowrose_bush")), Optional.empty())
        );

         */

        /*itemModelGenerator.register(ModBlocks.YELLOWROSE_BUSH.asItem(),
                new Model(Optional.empty(), Optional.empty()) {
                    @Override
                    public JsonObject createJson(Identifier id, Map<TextureKey, Identifier> textures) {
                        JsonObject root = new JsonObject();
                        JsonObject modelObj = new JsonObject();

                        // This builds the specific "type": "minecraft:model" structure
                        modelObj.addProperty("type", "minecraft:model");
                        modelObj.addProperty("model", "amazing-flowers:item/yellowrose_bush");

                        root.add("model", modelObj);
                        return root;
                    }
                }
        );*/

        /*Models.GENERATED.upload(
                ModelIds.getItemModelId(ModBlocks.YELLOWROSE_BUSH.asItem()),
                TextureMap.layer0(TextureMap.getSubId(ModBlocks.YELLOWROSE_BUSH.asItem(), "_top")),
                itemModelGenerator.modelCollector
        );*/

        //itemModelGenerator.register(ModBlocks.YELLOWROSE_BUSH.asItem(), Models.GENERATED);

    }

    @Override
    public String getName() {
        return "FabricDocsReference Model Provider";
    }
}