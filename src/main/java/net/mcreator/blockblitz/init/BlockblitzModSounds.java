
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockblitz.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.blockblitz.BlockblitzMod;

public class BlockblitzModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BlockblitzMod.MODID);
	public static final RegistryObject<SoundEvent> OSHI_TRACK = REGISTRY.register("oshi_track", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("blockblitz", "oshi_track")));
}
