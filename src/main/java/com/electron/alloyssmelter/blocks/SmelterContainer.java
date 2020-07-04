package com.electron.alloyssmelter.blocks;

import com.electron.alloyssmelter.ModContainers;
import com.electron.alloyssmelter.ModRecipes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.IIntArray;

public class SmelterContainer extends AbstractSmelterContainer {
    public SmelterContainer(int id, PlayerInventory playerInventoryIn) {
        super(ModContainers.SMELTER_CONTANER.get(), SmelterRecipe.ALLOY_RECIPE, id, playerInventoryIn);
    }

    public SmelterContainer(int id, PlayerInventory playerInventoryIn, IInventory furnaceInventoryIn, IIntArray p_i50083_4_) {
        super(ModContainers.SMELTER_CONTANER.get(), SmelterRecipe.ALLOY_RECIPE, id, playerInventoryIn, furnaceInventoryIn, p_i50083_4_);
    }
}
