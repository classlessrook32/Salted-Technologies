package net.classlessrook32.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.classlessrook32.mod.objects.blocks.BlockBase;
import net.classlessrook32.mod.objects.blocks.BlockSaltGlass;
import net.classlessrook32.mod.objects.blocks.machines.distiller.BLOCK_SALT_DISTILLERY_UNIT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_SALT_BLOCK = new BlockBase("block_salt_block", Material.GLASS);
	public static final Block BLOCK_SALT_BLOCK_BRICK = new BlockBase("block_salt_block_brick", Material.GLASS);
	public static final Block BLOCK_SALT_GLASS = new BlockSaltGlass("block_salt_glass", Material.GLASS); 
	//distillery
	public static final Block BLOCK_SALT_DISTILLERY_UNIT = new BLOCK_SALT_DISTILLERY_UNIT("salt_distillery_unit");
}
