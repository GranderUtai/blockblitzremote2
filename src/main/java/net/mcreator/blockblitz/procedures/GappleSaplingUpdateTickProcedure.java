package net.mcreator.blockblitz.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GappleSaplingUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.05) {
			if (Math.random() > 0 && Math.random() < 0.25) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("blockblitz", "gappletree1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y, z - 4), BlockPos.containing(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() > 0.25 && Math.random() < 0.5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("blockblitz", "gappletree2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 3), BlockPos.containing(x - 2, y, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() > 0.5 && Math.random() < 0.75) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("blockblitz", "gappletree3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 2), BlockPos.containing(x - 1, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() > 0.75 && Math.random() < 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("blockblitz", "gappletree4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 3), BlockPos.containing(x - 2, y, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
}
