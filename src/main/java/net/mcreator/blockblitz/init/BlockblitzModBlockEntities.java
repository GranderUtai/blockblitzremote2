
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockblitz.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.blockblitz.block.entity.MoldLavaBlockEntity;
import net.mcreator.blockblitz.block.entity.MoldIngotBlockEntity;
import net.mcreator.blockblitz.block.entity.MoldBlockEntity;
import net.mcreator.blockblitz.BlockblitzMod;

public class BlockblitzModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BlockblitzMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> MOLD = register("mold", BlockblitzModBlocks.MOLD, MoldBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MOLD_LAVA = register("mold_lava", BlockblitzModBlocks.MOLD_LAVA, MoldLavaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MOLD_INGOT = register("mold_ingot", BlockblitzModBlocks.MOLD_INGOT, MoldIngotBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
