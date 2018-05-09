package net.classlessrook32.mod.objects.tool;

import net.classlessrook32.mod.Main;
import net.classlessrook32.mod.init.ItemInit;
import net.classlessrook32.mod.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolPlough extends ItemHoe implements IHasModel{

	public ToolPlough(String name, ToolMaterial material) {
		super(material);
		
		
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


