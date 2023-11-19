package net.mcreator.blockblitz.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MainRecipeScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MoldSteelRecipeProcedure.execute(world, x, y, z);
	}
}
