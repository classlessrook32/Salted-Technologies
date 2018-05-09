package net.classlessrook32.mod.entity;

import java.util.Collection;

import javax.annotation.Nullable;

import net.classlessrook32.mod.init.ItemInit;
import net.classlessrook32.mod.util.handlers.LootTableHandler;
import net.classlessrook32.mod.util.handlers.SoundsHandler;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAICreeperSwell;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityClasslessrook32Salty extends EntityCreeper{
    private int explosionRadius = 8;

	public EntityClasslessrook32Salty(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 1.8F);
	}
	
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAICreeperSwell(this));
        this.tasks.addTask(8, new EntityAIAvoidEntity(this, EntityCreeper.class, 6.0F, 1.0D, 1.2D));
        this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 0.8D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.tasks.addTask(4, new EntityAIEatGrass(this));
        this.tasks.addTask(8, new EntityAIAvoidEntity(this, EntitySnowman.class, 6.0F, 1.0D, 1.2D));


	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2000999992939299939D);
	
	
	}
	@Override
	protected ResourceLocation getLootTable() {
		return LootTableHandler.saltyClass;
	}
	
	@Nullable
    protected Item getDropItem()
    {
        return ItemInit.ITEM_SALT;
    }
	
	@Override
	public float getEyeHeight() {
		return 1.8F;
	}
	
	 private void explode()
	    {
	        if (!this.world.isRemote)
	        {
	            boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this);
	            float f = this.getPowered() ? 2.0F : 1.0F;
	            this.dead = true;
	            this.world.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius * f, flag);
	            this.setDead();
	            this.spawnLingeringCloud();
	        }
	    }

	    private void spawnLingeringCloud()
	    {
	        Collection<PotionEffect> collection = this.getActivePotionEffects();

	        if (!collection.isEmpty())
	        {
	            EntityAreaEffectCloud entityareaeffectcloud = new EntityAreaEffectCloud(this.world, this.posX, this.posY, this.posZ);
	            entityareaeffectcloud.setRadius(2.5F);
	            entityareaeffectcloud.setRadiusOnUse(-0.5F);
	            entityareaeffectcloud.setWaitTime(10);
	            entityareaeffectcloud.setDuration(entityareaeffectcloud.getDuration() / 2);
	            entityareaeffectcloud.setRadiusPerTick(-entityareaeffectcloud.getRadius() / (float)entityareaeffectcloud.getDuration());

	            for (PotionEffect potioneffect : collection)
	            {
	                entityareaeffectcloud.addEffect(new PotionEffect(potioneffect));
	            }

	            this.world.spawnEntity(entityareaeffectcloud);
	        }
	    }

	    @Override
	    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
	    	return SoundsHandler.ENTITY_CLASSLESSROOK32_SALTY_HURT;
	    }
	    
	    @Override
	    protected SoundEvent getAmbientSound() {
	    	return SoundsHandler.ENTITY_CLASSLESSROOK32_SALTY_AMBIENT;
	    }
	    
	    @Override
	    protected SoundEvent getDeathSound() {
	    	return SoundsHandler.ENTITY_CLASSLESSROOK32_SALTY_DEATH;
	    }
	    
	
	
	
}
