package net.classlessrook32.mod.util.handlers;

import net.classlessrook32.mod.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void registerSmelting() {
		GameRegistry.addSmelting(ItemInit.ITEM_SALT_WATER, new ItemStack(ItemInit.ITEM_SALT, 2), 0.3F) ;
	}
}
