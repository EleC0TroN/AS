package com.electron.alloyssmelter.blocks;

import com.electron.alloyssmelter.ModBlocks;
import com.electron.alloyssmelter.ModRecipes;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.inventory.SmithingTableScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.util.ResourceLocation;

public class SmelterRecipe extends AbstractSmelterRecipe {
    public SmelterRecipe(ResourceLocation idIn, String groupIn, Ingredient ingredientIn_0, Ingredient ingredientIn_1, ItemStack resultIn, float experienceIn, int cookTimeIn) {
        super(ALLOY_RECIPE, idIn, groupIn, ingredientIn_0, ingredientIn_1, resultIn, experienceIn, cookTimeIn);
    }
    public static final IRecipeType<SmelterRecipe> ALLOY_RECIPE = new IRecipeType<SmelterRecipe>() {
        @Override
        public String toString() {
            return "alloyssmelter:alloying";
        }
    };

    public ItemStack getIcon() {
        return new ItemStack(ModBlocks.ALLOYS_SMELTER.get());
    }

    public IRecipeSerializer<?> getSerializer() {
        return ModRecipes.SMELTER;
    }
}
