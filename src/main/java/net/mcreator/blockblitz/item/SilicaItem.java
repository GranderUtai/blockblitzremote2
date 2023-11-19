
package net.mcreator.blockblitz.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilicaItem extends Item {
	public SilicaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
