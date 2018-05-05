package net.classlessrook32.mod.objects.blocks;

import net.classlessrook32.mod.Main;
import net.classlessrook32.mod.init.BlockInit;
import net.classlessrook32.mod.init.ItemInit;
import net.classlessrook32.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.sttab);
		setHardness(2.5F);
		setHarvestLevel("pickaxe", 0);
		setSoundType(blockSoundType.STONE);
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}