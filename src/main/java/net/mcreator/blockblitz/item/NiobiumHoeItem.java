
package net.mcreator.blockblitz.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.blockblitz.init.BlockblitzModItems;

public class NiobiumHoeItem extends HoeItem {
	public NiobiumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BlockblitzModItems.NIOBIUM_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
