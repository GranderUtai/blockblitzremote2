
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blockblitz.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.blockblitz.world.features.plants.CottonPlantFeature;
import net.mcreator.blockblitz.world.features.plants.ButtercupFeature;
import net.mcreator.blockblitz.world.features.plants.BluebellFeature;
import net.mcreator.blockblitz.world.features.plants.AutumnPlantFeature;
import net.mcreator.blockblitz.world.features.ores.TungstenOreFeature;
import net.mcreator.blockblitz.world.features.ores.QuartzOreFeature;
import net.mcreator.blockblitz.world.features.ores.OilOreFeature;
import net.mcreator.blockblitz.world.features.ores.NiobiumOreFeature;
import net.mcreator.blockblitz.world.features.ores.NiobiumDeepslateOreFeature;
import net.mcreator.blockblitz.world.features.ores.DeepslateQuartzOreFeature;
import net.mcreator.blockblitz.world.features.ores.DeepslateOilOreFeature;
import net.mcreator.blockblitz.world.features.ores.ChromeOreFeature;
import net.mcreator.blockblitz.world.features.ores.ChromeDeepslateOreFeature;
import net.mcreator.blockblitz.world.features.TumbleweedMessFeature;
import net.mcreator.blockblitz.world.features.GappleTree1Feature;
import net.mcreator.blockblitz.world.features.FrequentTumblesFeature;
import net.mcreator.blockblitz.BlockblitzMod;

@Mod.EventBusSubscriber
public class BlockblitzModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BlockblitzMod.MODID);
	public static final RegistryObject<Feature<?>> AUTUMN_PLANT = REGISTRY.register("autumn_plant", AutumnPlantFeature::new);
	public static final RegistryObject<Feature<?>> BLUEBELL = REGISTRY.register("bluebell", BluebellFeature::new);
	public static final RegistryObject<Feature<?>> BUTTERCUP = REGISTRY.register("buttercup", ButtercupFeature::new);
	public static final RegistryObject<Feature<?>> COTTON_PLANT = REGISTRY.register("cotton_plant", CottonPlantFeature::new);
	public static final RegistryObject<Feature<?>> QUARTZ_ORE = REGISTRY.register("quartz_ore", QuartzOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_QUARTZ_ORE = REGISTRY.register("deepslate_quartz_ore", DeepslateQuartzOreFeature::new);
	public static final RegistryObject<Feature<?>> OIL_ORE = REGISTRY.register("oil_ore", OilOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_OIL_ORE = REGISTRY.register("deepslate_oil_ore", DeepslateOilOreFeature::new);
	public static final RegistryObject<Feature<?>> TUNGSTEN_ORE = REGISTRY.register("tungsten_ore", TungstenOreFeature::new);
	public static final RegistryObject<Feature<?>> NIOBIUM_ORE = REGISTRY.register("niobium_ore", NiobiumOreFeature::new);
	public static final RegistryObject<Feature<?>> NIOBIUM_DEEPSLATE_ORE = REGISTRY.register("niobium_deepslate_ore", NiobiumDeepslateOreFeature::new);
	public static final RegistryObject<Feature<?>> CHROME_ORE = REGISTRY.register("chrome_ore", ChromeOreFeature::new);
	public static final RegistryObject<Feature<?>> CHROME_DEEPSLATE_ORE = REGISTRY.register("chrome_deepslate_ore", ChromeDeepslateOreFeature::new);
	public static final RegistryObject<Feature<?>> TUMBLEWEED_MESS = REGISTRY.register("tumbleweed_mess", TumbleweedMessFeature::new);
	public static final RegistryObject<Feature<?>> FREQUENT_TUMBLES = REGISTRY.register("frequent_tumbles", FrequentTumblesFeature::new);
	public static final RegistryObject<Feature<?>> GAPPLE_TREE_1 = REGISTRY.register("gapple_tree_1", GappleTree1Feature::new);
}
