package net.classlessrook32.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.classlessrook32.mod.objects.armour.ArmorBaseInfusedIron;
import net.classlessrook32.mod.objects.items.ItemBase;
import net.classlessrook32.mod.objects.tool.ToolBlade;
import net.classlessrook32.mod.objects.tool.ToolExcavator;
import net.classlessrook32.mod.objects.tool.ToolHatchet;
import net.classlessrook32.mod.objects.tool.ToolPlough;
import net.classlessrook32.mod.objects.tool.ToolTrowel;
import net.classlessrook32.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial Tool_Infused_Iron = EnumHelper.addToolMaterial("tool infused iron", 2, 750, 7.0F, 2.55F, 16);
	public static final ArmorMaterial Armor_Infused_Iron = EnumHelper.addArmorMaterial
				("armor infused iron", Reference.MODID + ":infusediron", 20, new int[] {5, 7, 8, 4}, 12, SoundEvents.BLOCK_METAL_FALL, 1.0F);

	//Items
	public static final Item ITEM_SALT = new ItemBase("item_salt");
	public static final Item ITEM_SALT_WATER = new ItemBase("item_salt_water");
	public static final Item ITEM_SALT_FRAGMENT = new ItemBase("item_salt_fragment");
	public static final Item INGOT_SALT_INFUSED_IRON = new ItemBase("ingot_salt_infused_iron");
	public static final Item ITEM_ALCHEMIC_SALT_POWDER = new ItemBase("item_alchemic_salt_powder");
	
	
	//iron infused tools
	public static final Item HATCHET_INFUSED_IRON = new ToolHatchet("hatchet_infused_iron", Tool_Infused_Iron);
	public static final Item PLOUGH_INFUSED_IRON = new ToolPlough("plough_infused_iron", Tool_Infused_Iron);
	public static final Item TROWEL_INFUSED_IRON = new ToolTrowel("trowel_infused_iron", Tool_Infused_Iron);
	public static final Item EXCAVATOR_INFUSED_IRON = new ToolExcavator("excavator_infused_iron", Tool_Infused_Iron);
	public static final Item BLADE_INFUSED_IRON = new ToolBlade("blade_infused_iron", Tool_Infused_Iron);

	//iron infused armor
	public static final Item BREASTPLATE_INFUSED_IRON = new ArmorBaseInfusedIron("breastplate_infused_iron", Armor_Infused_Iron, 1, EntityEquipmentSlot.CHEST);
	public static final Item CAP_INFUSED_IRON = new ArmorBaseInfusedIron("cap_infused_iron", Armor_Infused_Iron, 1, EntityEquipmentSlot.HEAD);
	public static final Item TROWSER_INFUSED_IRON = new ArmorBaseInfusedIron("trowser_infused_iron", Armor_Infused_Iron, 2, EntityEquipmentSlot.LEGS);
	public static final Item GALOSH_INFUSED_IRON = new ArmorBaseInfusedIron("galosh_infused_iron", Armor_Infused_Iron, 1, EntityEquipmentSlot.FEET);

}
