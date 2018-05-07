package net.classlessrook32.mod.tabs;

import net.classlessrook32.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.datafix.walkers.ItemStackDataLists;

public class stTab extends CreativeTabs{

	public stTab(String label) { super("stTab");
	this.setBackgroundImageName("st.png");}
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.ITEM_SALT);
	}
			
	
	
}