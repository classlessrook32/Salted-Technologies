package net.classlessrook32.mod.util.handlers;

import net.classlessrook32.mod.Main;
import net.classlessrook32.mod.init.BlockInit;
import net.classlessrook32.mod.init.EntityInit;
import net.classlessrook32.mod.init.ItemInit;
import net.classlessrook32.mod.util.GuiHandler;
import net.classlessrook32.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
		
		RecipeHandler.registerSmelting();
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();

	}
	
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for (Item item : ItemInit.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		
		for (Block block : BlockInit.BLOCKS) {
			if (block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
	}
	public static void preInitRegistries()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
		
	
	}
	
	public static void initRegistries(){
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());

	}
	
	public static void postInitRegistries()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());

	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		
	}
}
