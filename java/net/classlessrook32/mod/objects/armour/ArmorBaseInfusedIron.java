package net.classlessrook32.mod.objects.armour;

import net.classlessrook32.mod.Main;
import net.classlessrook32.mod.init.ItemInit;
import net.classlessrook32.mod.util.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBaseInfusedIron extends ItemArmor implements IHasModel{

	public ArmorBaseInfusedIron(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
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


