package net.classlessrook32.mod.objects.blocks;

import net.classlessrook32.mod.Main;
import net.classlessrook32.mod.init.BlockInit;
import net.classlessrook32.mod.init.ItemInit;
import net.classlessrook32.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSaltGlass extends BlockGlass implements IHasModel {

	public BlockSaltGlass(String name, Material material) {
		super(material, true);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.sttab);
		setHardness(0.3F);
		setHarvestLevel("pickaxe", 0);
		setSoundType(blockSoundType.GLASS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    public boolean isFullCube(IBlockState state)
    {
        return true;
    }

   

    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return state.isOpaqueCube();
    }
    
    
}
