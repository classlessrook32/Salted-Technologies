
package net.classlessrook32.mod.objects.blocks.machines.distiller;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.classlessrook32.mod.init.ItemInit;
import net.minecraft.item.ItemStack;

public class SaltDistilleryUnitRecipes 
{	
	private static final SaltDistilleryUnitRecipes INSTANCE = new SaltDistilleryUnitRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static SaltDistilleryUnitRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private SaltDistilleryUnitRecipes() 
	{		//recipes

		addDistilleryRecipe(new ItemStack(ItemInit.ITEM_SALT_WATER), new ItemStack(ItemInit.ITEM_ALCHEMIC_SALT_POWDER), new ItemStack(ItemInit.ITEM_SALT, 16), 36F);
		//addSinteringRecipe(new ItemStack(BlockInit.BLOCK_COPPER), new ItemStack(BlockInit.ORE_OVERWORLD), new ItemStack(Blocks.ACACIA_FENCE), 5.0F);
		//addSinteringRecipe(new ItemStack(Blocks.ACACIA_FENCE), new ItemStack(Blocks.ACACIA_FENCE_GATE), new ItemStack(BlockInit.SINTERING_FURNACE), 5.0F);
	}

	
	public void addDistilleryRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getDistilleryResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getDistilleryResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getSinteringExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}