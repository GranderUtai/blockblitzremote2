
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockblitz.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.blockblitz.BlockblitzMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockblitzModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockblitzMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(BlockblitzModBlocks.APPLE_PLANKS.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_LOG.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_WOOD.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_DOOR.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_STAIRS.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_SLAB.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_FENCE.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_FENCE_GATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_PLANKS.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_LOG.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_WOOD.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_DOOR.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_STAIRS.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_SLAB.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_FENCE.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_FENCE_GATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_PLANKS.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_LOG.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_WOOD.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_DOOR.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_STAIRS.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_SLAB.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_FENCE.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_FENCE_GATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_PLANKS.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_LOG.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_WOOD.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_DOOR.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_STAIRS.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_SLAB.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_FENCE.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_FENCE_GATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.AEROGEL_BLOCK.get().asItem());
			tabData.accept(BlockblitzModBlocks.OIL_BLOCK.get().asItem());
			tabData.accept(BlockblitzModBlocks.RAW_TUNGSTEN_BLOCK.get().asItem());
			tabData.accept(BlockblitzModBlocks.RAW_NIOBIUM_BLOCK.get().asItem());
			tabData.accept(BlockblitzModBlocks.RAW_CHROME_BLOCK.get().asItem());
			tabData.accept(BlockblitzModBlocks.BLOCK_OF_TUNGSTEN.get().asItem());
			tabData.accept(BlockblitzModBlocks.BLOCK_OF_STEEL.get().asItem());
			tabData.accept(BlockblitzModBlocks.BLOCK_OF_ANODIZED_STEEL.get().asItem());
			tabData.accept(BlockblitzModBlocks.BLOCK_OF_NIOBIUM.get().asItem());
			tabData.accept(BlockblitzModBlocks.BLOCK_OF_CHROME.get().asItem());
			tabData.accept(BlockblitzModBlocks.IRON_GRATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.GOLDEN_GRATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.GOLD_DOOR.get().asItem());
			tabData.accept(BlockblitzModBlocks.CALCITE_STAIRS.get().asItem());
			tabData.accept(BlockblitzModBlocks.CALCITE_SLAB.get().asItem());
			tabData.accept(BlockblitzModBlocks.CALCITE_WALL.get().asItem());
			tabData.accept(BlockblitzModBlocks.CALCITE_BRICKS.get().asItem());
			tabData.accept(BlockblitzModBlocks.CALCITE_BRICK_STAIRS.get().asItem());
			tabData.accept(BlockblitzModBlocks.CALCITE_BRICK_SLAB.get().asItem());
			tabData.accept(BlockblitzModBlocks.CALCITE_BRICK_WALL.get().asItem());
			tabData.accept(BlockblitzModBlocks.CHISELED_CALCITE.get().asItem());
			tabData.accept(BlockblitzModBlocks.POLISHED_CALCITE.get().asItem());
			tabData.accept(BlockblitzModBlocks.POLISHED_CALCITE_STAIRS.get().asItem());
			tabData.accept(BlockblitzModBlocks.POLISHED_CALCITE_SLAB.get().asItem());
			tabData.accept(BlockblitzModBlocks.POLISHED_CALCITE_WALL.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(BlockblitzModBlocks.APPLE_TRAPDOOR.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_TRAPDOOR.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_TRAPDOOR.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_TRAPDOOR.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.ANDESITE_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.ANDESITE_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.DIORITE_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.GOLD_TRAPDOOR.get().asItem());
			tabData.accept(BlockblitzModBlocks.DIORITE_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.GRANITE_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.GRANITE_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.CALCITE_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.CALCITE_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.TUFF_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.TUFF_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.GOLD_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.IRON_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.AMETHYST_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.AMETHYST_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.DEEPSLATE_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.DEEPSLATE_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.OBSIDIAN_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.OBSIDIAN_PRESSURE_PLATE.get().asItem());
			tabData.accept(BlockblitzModBlocks.QUARTZ_BUTTON.get().asItem());
			tabData.accept(BlockblitzModBlocks.QUARTZ_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(BlockblitzModBlocks.GOLDEN_APPLE_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.MOLD.get().asItem());
			tabData.accept(BlockblitzModBlocks.ACACIA_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.BAMBOO_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.BIRCH_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.CHERRY_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.CRIMSON_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.DARK_OAK_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.JUNGLE_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.MANGROVE_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.SPRUCE_BOOKSHELF.get().asItem());
			tabData.accept(BlockblitzModBlocks.WARPED_BOOKSHELF.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BlockblitzModItems.NIOBIUM_SWORD.get());
			tabData.accept(BlockblitzModItems.COPPER_SWORD.get());
			tabData.accept(BlockblitzModItems.STEEL_SWORD.get());
			tabData.accept(BlockblitzModItems.CHROME_SWORD.get());
			tabData.accept(BlockblitzModItems.AMETHYST_KNIFE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(BlockblitzModItems.SILICA.get());
			tabData.accept(BlockblitzModItems.AEROGEL_SHARD.get());
			tabData.accept(BlockblitzModItems.OIL.get());
			tabData.accept(BlockblitzModItems.RAW_TUNGSTEN.get());
			tabData.accept(BlockblitzModItems.TUNGSTEN_INGOT.get());
			tabData.accept(BlockblitzModItems.ANODIZED_STEEL_INGOT.get());
			tabData.accept(BlockblitzModItems.RAW_NIOBIUM.get());
			tabData.accept(BlockblitzModItems.NIOBIUM_INGOT.get());
			tabData.accept(BlockblitzModItems.RAW_CHROME.get());
			tabData.accept(BlockblitzModItems.CHROME_INGOT.get());
			tabData.accept(BlockblitzModItems.STEEL_INGOT.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
			tabData.accept(BlockblitzModBlocks.WHITE_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.LIGHT_GRAY_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.GRAY_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.BLACK_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.BROWN_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.RED_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.ORANGE_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.YELLOW_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.LIME_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.GREEN_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.CYAN_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.LIGHT_BLUE_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.BLUE_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.PURPLE_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAGENTA_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.PINK_TURF.get().asItem());
			tabData.accept(BlockblitzModBlocks.WHITE_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.LIGHT_GRAY_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.GRAY_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.BLACK_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.BROWN_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.RED_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.ORANGE_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.YELLOW_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.GREEN_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.LIME_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.CYAN_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.LIGHT_BLUE_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.BLUE_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.PURPLE_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAGENTA_TURF_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.PINK_TURF_CARPET.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BlockblitzModItems.OSHI_HIT_TRACK.get());
			tabData.accept(BlockblitzModItems.COPPER_SHOVEL.get());
			tabData.accept(BlockblitzModItems.COPPER_PICKAXE.get());
			tabData.accept(BlockblitzModItems.COPPER_AXE.get());
			tabData.accept(BlockblitzModItems.COPPER_HOE.get());
			tabData.accept(BlockblitzModItems.STEEL_SHOVEL.get());
			tabData.accept(BlockblitzModItems.STEEL_PICKAXE.get());
			tabData.accept(BlockblitzModItems.STEEL_AXE.get());
			tabData.accept(BlockblitzModItems.STEEL_HOE.get());
			tabData.accept(BlockblitzModItems.NIOBIUM_SHOVEL.get());
			tabData.accept(BlockblitzModItems.NIOBIUM_PICKAXE.get());
			tabData.accept(BlockblitzModItems.NIOBIUM_AXE.get());
			tabData.accept(BlockblitzModItems.NIOBIUM_HOE.get());
			tabData.accept(BlockblitzModItems.CHROME_SHOVEL.get());
			tabData.accept(BlockblitzModItems.CHROME_PICKAXE.get());
			tabData.accept(BlockblitzModItems.CHROME_AXE.get());
			tabData.accept(BlockblitzModItems.CHROME_HOE.get());
			tabData.accept(BlockblitzModItems.AMETHYST_SHOVEL.get());
			tabData.accept(BlockblitzModItems.AMETHYST_PICKAXE.get());
			tabData.accept(BlockblitzModItems.AMETHYST_AXE.get());
			tabData.accept(BlockblitzModItems.AMETHYST_HOE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(BlockblitzModBlocks.AUTUMN_PLANT.get().asItem());
			tabData.accept(BlockblitzModBlocks.BLUEBELL.get().asItem());
			tabData.accept(BlockblitzModBlocks.BUTTERCUP.get().asItem());
			tabData.accept(BlockblitzModBlocks.COTTON_PLANT.get().asItem());
			tabData.accept(BlockblitzModBlocks.TUMBLEWEED.get().asItem());
			tabData.accept(BlockblitzModBlocks.COTTON_BLOCK.get().asItem());
			tabData.accept(BlockblitzModBlocks.DENIM_BLOCK.get().asItem());
			tabData.accept(BlockblitzModBlocks.QUARTZ_ORE.get().asItem());
			tabData.accept(BlockblitzModBlocks.DEEPSLATE_QUARTZ_ORE.get().asItem());
			tabData.accept(BlockblitzModBlocks.OIL_ORE.get().asItem());
			tabData.accept(BlockblitzModBlocks.DEEPSLATE_OIL_ORE.get().asItem());
			tabData.accept(BlockblitzModBlocks.TUNGSTEN_ORE.get().asItem());
			tabData.accept(BlockblitzModBlocks.DEEPSLATE_TUNGSTEN_ORE.get().asItem());
			tabData.accept(BlockblitzModBlocks.NIOBIUM_ORE.get().asItem());
			tabData.accept(BlockblitzModBlocks.NIOBIUM_DEEPSLATE_ORE.get().asItem());
			tabData.accept(BlockblitzModBlocks.CHROME_ORE.get().asItem());
			tabData.accept(BlockblitzModBlocks.CHROME_DEEPSLATE_ORE.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_LEAVES.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_LEAVES.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_LEAVES.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_LEAVES.get().asItem());
			tabData.accept(BlockblitzModBlocks.MAPLE_SAPLING.get().asItem());
			tabData.accept(BlockblitzModBlocks.MULBERRY_SAPLING.get().asItem());
			tabData.accept(BlockblitzModBlocks.GAPPLE_SAPLING.get().asItem());
			tabData.accept(BlockblitzModBlocks.APPLE_SAPPLING.get().asItem());
			tabData.accept(BlockblitzModBlocks.COTTON_CARPET.get().asItem());
			tabData.accept(BlockblitzModBlocks.DENIM_CARPET.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(BlockblitzModItems.MULBERRIES.get());
		}
	}
}
