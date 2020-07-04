package com.electron.alloyssmelter.blocks;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class SmelterFuelSlot extends Slot {
    private final AbstractSmelterContainer field_216939_a;

    public SmelterFuelSlot(AbstractSmelterContainer p_i50084_1_, IInventory p_i50084_2_, int p_i50084_3_, int p_i50084_4_, int p_i50084_5_) {
        super(p_i50084_2_, p_i50084_3_, p_i50084_4_, p_i50084_5_);
        this.field_216939_a = p_i50084_1_;
    }

    public boolean isItemValid(ItemStack stack) {
        return this.field_216939_a.isFuel(stack);
    }

    public int getItemStackLimit(ItemStack stack) {
        return super.getItemStackLimit(stack);
    }

}