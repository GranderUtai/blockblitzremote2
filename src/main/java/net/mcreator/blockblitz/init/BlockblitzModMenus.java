
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockblitz.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.blockblitz.world.inventory.MoldGuiMenu;
import net.mcreator.blockblitz.BlockblitzMod;

public class BlockblitzModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BlockblitzMod.MODID);
	public static final RegistryObject<MenuType<MoldGuiMenu>> MOLD_GUI = REGISTRY.register("mold_gui", () -> IForgeMenuType.create(MoldGuiMenu::new));
}
