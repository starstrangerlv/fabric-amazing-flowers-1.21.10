package lv.starstranger.item;

import lv.starstranger.AmazingFlowers;
import lv.starstranger.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // 1. Define the Registry Key
    public static final RegistryKey<ItemGroup> AMAZING_FLOWERS_KEY = RegistryKey.of(
            RegistryKeys.ITEM_GROUP,
            Identifier.of(AmazingFlowers.MOD_ID, "amazing_flowers")
    );

    // 2. Build and Register the ItemGroup
    public static final ItemGroup AMAZING_FLOWERS = Registry.register(
            Registries.ITEM_GROUP,
            AMAZING_FLOWERS_KEY,
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.your_mod_id.amazing_flowers"))
                    .icon(() -> new ItemStack(ModBlocks.JOE_PYE_WEED.asItem())) // Set your icon here
                    .entries((displayContext, itemGroup) -> {
                        //entries.add(Items.POPPY); // Add items to the group
                        itemGroup.add(ModBlocks.COSMIC_FLOWER.asItem());

                        itemGroup.add(ModBlocks.TARAXACUM.asItem());
                        itemGroup.add(ModBlocks.BLUEBELLS.asItem());
                        itemGroup.add(ModBlocks.ANEMONE_PINK.asItem());
                        itemGroup.add(ModBlocks.ANEMONE_RED.asItem());
                        itemGroup.add(ModBlocks.ANEMONE_WHITE.asItem());
                        itemGroup.add(ModBlocks.ANEMONE_PURPLE.asItem());
                        itemGroup.add(ModBlocks.BEGONIA_PINK.asItem());
                        itemGroup.add(ModBlocks.BEGONIA_RED.asItem());
                        itemGroup.add(ModBlocks.BEGONIA_WHITE.asItem());
                        itemGroup.add(ModBlocks.BEGONIA_YELLOW.asItem());
                        itemGroup.add(ModBlocks.CROCUS_WHITE.asItem());
                        itemGroup.add(ModBlocks.CROCUS_YELLOW.asItem());
                        itemGroup.add(ModBlocks.CROCUS_PINK.asItem());
                        itemGroup.add(ModBlocks.CROCUS_PURPLE.asItem());
                        itemGroup.add(ModBlocks.DIGITALIS_PURPUREA_RUBY.asItem());
                        itemGroup.add(ModBlocks.DIGITALIS_PURPUREA_PURPLE.asItem());
                        itemGroup.add(ModBlocks.DELPHINIUM.asItem());
                        itemGroup.add(ModBlocks.JOE_PYE_WEED.asItem());
                        itemGroup.add(ModBlocks.WHITEROSE_BUSH.asItem());
                        itemGroup.add(ModBlocks.YELLOWROSE_BUSH.asItem());
                        itemGroup.add(ModBlocks.PURPLEROSE_BUSH.asItem());

                        itemGroup.add(ModBlocks.POTTED_COSMIC_FLOWER.asItem());
                        itemGroup.add(ModBlocks.POTTED_TARAXACUM.asItem());
                        itemGroup.add(ModBlocks.POTTED_BLUEBELLS.asItem());

                        itemGroup.add(ModBlocks.POTTED_ANEMONE_PINK.asItem());
                        itemGroup.add(ModBlocks.POTTED_ANEMONE_WHITE.asItem());
                        itemGroup.add(ModBlocks.POTTED_ANEMONE_RED.asItem());
                        itemGroup.add(ModBlocks.POTTED_ANEMONE_PURPLE.asItem());

                        itemGroup.add(ModBlocks.POTTED_BEGONIA_PINK.asItem());
                        itemGroup.add(ModBlocks.POTTED_BEGONIA_RED.asItem());
                        itemGroup.add(ModBlocks.POTTED_BEGONIA_WHITE.asItem());
                        itemGroup.add(ModBlocks.POTTED_BEGONIA_YELLOW.asItem());
                    })
                    .build()
    );

    public static void registerItemGroups() {
        
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.COSMIC_FLOWER.asItem());
            itemGroup.add(ModBlocks.TARAXACUM.asItem());
            itemGroup.add(ModBlocks.BLUEBELLS.asItem());
            itemGroup.add(ModBlocks.ANEMONE_PINK.asItem());
            itemGroup.add(ModBlocks.ANEMONE_RED.asItem());
            itemGroup.add(ModBlocks.ANEMONE_WHITE.asItem());
            itemGroup.add(ModBlocks.ANEMONE_PURPLE.asItem());
            itemGroup.add(ModBlocks.BEGONIA_PINK.asItem());
            itemGroup.add(ModBlocks.BEGONIA_RED.asItem());
            itemGroup.add(ModBlocks.BEGONIA_WHITE.asItem());
            itemGroup.add(ModBlocks.BEGONIA_YELLOW.asItem());
            itemGroup.add(ModBlocks.CROCUS_WHITE.asItem());
            itemGroup.add(ModBlocks.CROCUS_YELLOW.asItem());
            itemGroup.add(ModBlocks.CROCUS_PINK.asItem());
            itemGroup.add(ModBlocks.CROCUS_PURPLE.asItem());
            itemGroup.add(ModBlocks.DIGITALIS_PURPUREA_RUBY.asItem());
            itemGroup.add(ModBlocks.DIGITALIS_PURPUREA_PURPLE.asItem());
            itemGroup.add(ModBlocks.DELPHINIUM.asItem());
            itemGroup.add(ModBlocks.JOE_PYE_WEED.asItem());
            itemGroup.add(ModBlocks.WHITEROSE_BUSH.asItem());
            itemGroup.add(ModBlocks.YELLOWROSE_BUSH.asItem());
            itemGroup.add(ModBlocks.PURPLEROSE_BUSH.asItem());
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.POTTED_COSMIC_FLOWER.asItem());
            itemGroup.add(ModBlocks.POTTED_TARAXACUM.asItem());
            itemGroup.add(ModBlocks.POTTED_BLUEBELLS.asItem());

            itemGroup.add(ModBlocks.POTTED_ANEMONE_PINK.asItem());
            itemGroup.add(ModBlocks.POTTED_ANEMONE_WHITE.asItem());
            itemGroup.add(ModBlocks.POTTED_ANEMONE_RED.asItem());
            itemGroup.add(ModBlocks.POTTED_ANEMONE_PURPLE.asItem());

            itemGroup.add(ModBlocks.POTTED_ANEMONE_PINK.asItem());
            itemGroup.add(ModBlocks.POTTED_ANEMONE_WHITE.asItem());
            itemGroup.add(ModBlocks.POTTED_ANEMONE_RED.asItem());
            itemGroup.add(ModBlocks.POTTED_ANEMONE_PURPLE.asItem());
        });
    }
}
