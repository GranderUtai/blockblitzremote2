
package net.mcreator.blockblitz.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.blockblitz.init.BlockblitzModItems;

public class ChromeHoeItem extends HoeItem {
	public ChromeHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 300;
			}

			public float getSpeed() {
				return 4f;
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
				return Ingredient.of(new ItemStack(BlockblitzModItems.CHROME_INGOT.get()));
			}
		}, 0, -3.5f, new Item.Properties());
	}
}
