package net.classlessrook32.mod.entity.render;

import net.classlessrook32.mod.entity.EntityClasslessrook32Salty;
import net.classlessrook32.mod.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderClasslessrook32Salty extends RenderLiving<EntityClasslessrook32Salty>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/classlessrook32_salty.png");
	
	public RenderClasslessrook32Salty(RenderManager manager) {
		super(manager, new ModelClasslessrook32Salty(), 0.5F );
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityClasslessrook32Salty entity) {
		// TODO Auto-generated method stub
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityClasslessrook32Salty entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
