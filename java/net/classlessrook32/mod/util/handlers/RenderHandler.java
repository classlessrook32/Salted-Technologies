package net.classlessrook32.mod.util.handlers;

import net.classlessrook32.mod.entity.EntityClasslessrook32Salty;
import net.classlessrook32.mod.entity.render.RenderClasslessrook32Salty;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityClasslessrook32Salty.class, new IRenderFactory<EntityClasslessrook32Salty>()
		{
			@Override
			public Render<? super EntityClasslessrook32Salty> createRenderFor(RenderManager manager) 
			{
				return new RenderClasslessrook32Salty(manager);
			}
		});
	}
}