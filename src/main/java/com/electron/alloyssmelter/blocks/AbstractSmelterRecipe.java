package com.electron.alloyssmelter.blocks;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public abstract class AbstractSmelterRecipe implements IRecipe<IInventory> {
    protected final IRecipeType<?> type;
    protected final ResourceLocation id;
    protected final String group;
    protected final Ingredient ingredient_0;
    protected final Ingredient ingredient_1;
    protected final ItemStack result;
    protected final float experience;
    protected final int cookTime;

    public AbstractSmelterRecipe(IRecipeType<?> typeIn, ResourceLocation idIn, String groupIn, Ingredient ingredientIn_0, Ingredient ingredientIn_1, ItemStack resultIn, float experienceIn, int cookTimeIn) {
        this.type = typeIn;
        this.id = idIn;
        this.group = groupIn;
        this.ingredient_0 = ingredientIn_0;
        this.ingredient_1 = ingredientIn_1;
        this.result = resultIn;
        this.experience = experienceIn;
        this.cookTime = cookTimeIn;
    }

    public boolean matches(IInventory inv, World worldIn) {
        return this.ingredient_0.test(inv.getStackInSlot(0)) && this.ingredient_1.test(inv.getStackInSlot(3));
    }

    public ItemStack getCraftingResult(IInventory inv) {
        return this.result.copy();
    }

    public boolean canFit(int width, int height) {
        return true;
    }

    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> nonnulllist = NonNullList.create();
        nonnulllist.add(this.ingredient_0);
        nonnulllist.add(this.ingredient_1);
        return nonnulllist;
    }

    public float getExperience() {
        return this.experience;
    }

    public ItemStack getRecipeOutput() {
        return this.result;
    }

    public String getGroup() {
        return this.group;
    }

    public int getCookTime() {
        return this.cookTime;
    }

    public ResourceLocation getId() {
        return this.id;
    }

    public IRecipeType<?> getType() {
        return this.type;
    }
}
