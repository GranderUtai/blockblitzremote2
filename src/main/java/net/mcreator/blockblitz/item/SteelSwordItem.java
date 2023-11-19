
package net.mcreator.blockblitz.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.blockblitz.init.BlockblitzModItems;

public class SteelSwordItem extends SwordItem {
	public SteelSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 450;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BlockblitzModItems.STEEL_INGOT.get()), new ItemStack(BlockblitzModItems.ANODIZED_STEEL_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}
