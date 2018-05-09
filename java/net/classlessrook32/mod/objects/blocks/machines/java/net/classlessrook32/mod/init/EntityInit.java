package net.classlessrook32.mod.init;

import net.classlessrook32.mod.Main;
import net.classlessrook32.mod.entity.EntityClasslessrook32Salty;
import net.classlessrook32.mod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

	public static void registerEntities() {
		registerEntity("classlessrook32salty", EntityClasslessrook32Salty.class, Reference.ENTITY_CLASSLESSROOK32_SALTY, 50, 000000, 666500);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name),  entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
