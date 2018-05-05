package net.classlessrook32.mod.objects.blocks.machines.distiller.slot;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;

public class SlotSaltDistilleryUnitFuel extends Slot
{
    public SlotSaltDistilleryUnitFuel(IInventory inventoryIn, int slotIndex, int xPosition, int yPosition)
    {
        super(inventoryIn, slotIndex, xPosition, yPosition);
    }

   
    public boolean isItemValid(ItemStack stack)
    {
        return TileEntityFurnace.isItemFuel(stack) || isBucket(stack);
    }

    public int getItemStackLimit(ItemStack stack)
    {
        return isBucket(stack) ? 1 : super.getItemStackLimit(stack);
    }

    public static boolean isBucket(ItemStack stack)
    {
        return stack.getItem() == Items.BUCKET;
    }
}