package lv.starstranger.block;

import lv.starstranger.AmazingFlowers;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.block.Blocks.createFlowerPotSettings;

public class ModBlocks {

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.COSMIC_FLOWER.asItem());
            itemGroup.add(ModBlocks.TARAXACUM.asItem());
            itemGroup.add(ModBlocks.DIGITALIS_PURPUREA_RUBY.asItem());
            itemGroup.add(ModBlocks.DIGITALIS_PURPUREA_PURPLE.asItem());
            itemGroup.add(ModBlocks.WHITEROSE_BUSH.asItem());
            itemGroup.add(ModBlocks.YELLOWROSE_BUSH.asItem());
            itemGroup.add(ModBlocks.PURPLEROSE_BUSH.asItem());
        });
    }

    public static final Block COSMIC_FLOWER = register("cosmic_flower",
            settings -> new FlowerBlock(StatusEffects.REGENERATION, 10, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY), true);

    public static final Block TARAXACUM = register("taraxacum",
            settings -> new FlowerBlock(StatusEffects.REGENERATION, 10, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY), true);

    public static final Block POTTED_COSMIC_FLOWER = register("potted_cosmic_flower",
            settings -> new FlowerBlock(StatusEffects.REGENERATION, 10, settings),
            AbstractBlock.Settings.create().copyShallow(COSMIC_FLOWER), true);

    public static final Block POTTED_TARAXACUM = register("potted_taraxacum",
            settings -> new FlowerBlock(StatusEffects.REGENERATION, 10, settings),
            AbstractBlock.Settings.create().copyShallow(TARAXACUM), true);


    public static final Block DIGITALIS_PURPUREA_RUBY = register("digitalis_purpurea_ruby",
            TallFlowerBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY), true
    );

    public static final Block DIGITALIS_PURPUREA_PURPLE = register("digitalis_purpurea_purple",
            TallFlowerBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY), true
    );

    public static final Block WHITEROSE_BUSH = register("whiterose_bush",
            TallFlowerBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY), true
    );

    public static final Block YELLOWROSE_BUSH = register("yellowrose_bush",
            TallFlowerBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY), true
    );

    public static final Block PURPLEROSE_BUSH = register("purplerose_bush",
            TallFlowerBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY), true
    );






    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        RegistryKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(AmazingFlowers.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AmazingFlowers.MOD_ID, name));
    }
}
