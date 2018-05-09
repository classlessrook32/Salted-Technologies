package net.classlessrook32.mod.util.handlers;

import net.classlessrook32.mod.objects.blocks.machines.distiller.ContainerSaltDistilleryUnit;
import net.classlessrook32.mod.objects.blocks.machines.distiller.GuiDistiller;
import net.classlessrook32.mod.objects.blocks.machines.distiller.TileEntitySaltDistilleryUnit;
import net.classlessrook32.mod.util.Reference;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandlerDistiller implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	 {
	  if(ID == Reference.GUI_SALT_DISTILLERY_UNIT) return new ContainerSaltDistilleryUnit(player.inventory, (TileEntitySaltDistilleryUnit)world.getTileEntity(new BlockPos(x,y,z)));
	  return null;
	 }

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	 {
	  if(ID == Reference.GUI_SALT_DISTILLERY_UNIT) return new GuiDistiller(player.inventory, (TileEntitySaltDistilleryUnit)world.getTileEntity(new BlockPos(x,y,z)));
	  return null;
	 }
	

}