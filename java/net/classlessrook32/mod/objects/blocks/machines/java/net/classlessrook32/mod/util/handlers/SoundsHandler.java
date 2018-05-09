package net.classlessrook32.mod.util.handlers;

import net.classlessrook32.mod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
	public static SoundEvent ENTITY_CLASSLESSROOK32_SALTY_AMBIENT, ENTITY_CLASSLESSROOK32_SALTY_HURT, ENTITY_CLASSLESSROOK32_SALTY_DEATH;

	public static void registerSounds() {
		ENTITY_CLASSLESSROOK32_SALTY_AMBIENT = registerSound("entity.salty.ambient");
		
	}
	
	private static SoundEvent registerSound(String name) {
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}


}
