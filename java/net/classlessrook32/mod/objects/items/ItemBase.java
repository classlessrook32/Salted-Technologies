package net.classlessrook32.mod.objects.items;

import net.classlessrook32.mod.Main;
import net.classlessrook32.mod.init.ItemInit;
import net.classlessrook32.mod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.sttab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
