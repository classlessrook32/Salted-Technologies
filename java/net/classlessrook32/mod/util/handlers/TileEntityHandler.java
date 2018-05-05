package net.classlessrook32.mod.util.handlers;
import net.classlessrook32.mod.objects.blocks.machines.distiller.TileEntitySaltDistilleryUnit;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntitySaltDistilleryUnit.class, "salt_distillery_unit");
	}

}