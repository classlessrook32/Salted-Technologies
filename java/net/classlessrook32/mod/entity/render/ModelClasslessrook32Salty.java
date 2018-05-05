package net.classlessrook32.mod.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelClasslessrook32Salty extends ModelBase {
    public ModelRenderer headpivet;
    public ModelRenderer leftarm;
    public ModelRenderer Rightleg;
    public ModelRenderer head;
    public ModelRenderer leftleg;
    public ModelRenderer rightarm;
    public ModelRenderer rightpivet;
    public ModelRenderer head_1;
    public ModelRenderer torso;
    public ModelRenderer leftarm_1;
    public ModelRenderer leftleg_1;
    public ModelRenderer headpivet_1;

    public ModelClasslessrook32Salty() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.head_1 = new ModelRenderer(this, 0, 0);
        this.head_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head_1.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.headpivet_1 = new ModelRenderer(this, 16, 32);
        this.headpivet_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headpivet_1.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.Rightleg = new ModelRenderer(this, 0, 32);
        this.Rightleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.Rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);
        this.leftarm = new ModelRenderer(this, 48, 48);
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F);
        this.head = new ModelRenderer(this, 32, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.torso = new ModelRenderer(this, 16, 16);
        this.torso.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.torso.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 48);
        this.leftleg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);
        this.leftarm_1 = new ModelRenderer(this, 32, 48);
        this.leftarm_1.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm_1.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rightpivet = new ModelRenderer(this, 0, 16);
        this.rightpivet.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.rightpivet.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.headpivet = new ModelRenderer(this, 24, 0);
        this.headpivet.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headpivet.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.leftleg_1 = new ModelRenderer(this, 16, 48);
        this.leftleg_1.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.leftleg_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.head_1.render(f5);
        this.headpivet_1.render(f5);
        this.Rightleg.render(f5);
        this.leftarm.render(f5);
        this.head.render(f5);
        this.torso.render(f5);
        this.leftleg.render(f5);
        this.leftarm_1.render(f5);
        this.rightpivet.render(f5);
        this.rightarm.render(f5);
        this.headpivet.render(f5);
        this.leftleg_1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entityIn) {
    	this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  
    	this.Rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

    	this.head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.head.rotateAngleX = headPitch * 0.017453292F;

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



