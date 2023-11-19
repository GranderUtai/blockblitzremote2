package net.mcreator.blockblitz.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MainRecipeScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MoldSteelRecipeProcedure.execute(world, x, y, z);
	}
}
