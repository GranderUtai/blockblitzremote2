
package net.mcreator.blockblitz.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OilItem extends Item {
	public OilItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
