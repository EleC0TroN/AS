package com.electron.alloyssmelter.blocks;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nonnull;

public class AlloyingRecipeSerializer<T extends AbstractSmelterRecipe> extends net.minecraftforge.registries.ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<T> {
    private final AlloyingRecipeSerializer.IFactory<T> factory;

    public AlloyingRecipeSerializer(AlloyingRecipeSerializer.IFactory<T> factory) {
        this.factory = factory;
    }

    @Override
    public T read(ResourceLocation recipeId, JsonObject json) {
        String s = JSONUtils.getString(json, "group", "");
        JsonElement jsonelement_0 = JSONUtils.isJsonArray(json, "ingredient_0") ? JSONUtils.getJsonArray(json, "ingredient_0") : JSONUtils.getJsonObject(json, "ingredient_0");
        JsonElement jsonelement_1 = JSONUtils.isJsonArray(json, "ingredient_1") ? JSONUtils.getJsonArray(json, "ingredient_1") : JSONUtils.getJsonObject(json, "ingredient_1");

        Ingredient ingredient_0 = Ingredient.deserialize(jsonelement_0);
        Ingredient ingredient_1 = Ingredient.deserialize(jsonelement_1);
        ItemStack itemstack;

        if (!json.has("result")) {
            throw new com.google.gson.JsonSyntaxException("Missing result, expected to find a string or object");
        }

        if (json.get("result").isJsonObject()) {
            itemstack = ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "result"));
        } else {
            String s1 = JSONUtils.getString(json, "result");
            ResourceLocation resourcelocation = new ResourceLocation(s1);
            itemstack = new ItemStack(Registry.ITEM.getValue(resourcelocation).orElseThrow(() -> new IllegalStateException("Item: " + s1 + " does not exist")));
        }

        float f = JSONUtils.getFloat(json, "experience", 0.0F);
        int i = JSONUtils.getInt(json, "smeltingTime", 200);

        return this.factory.create(recipeId, s, ingredient_0, ingredient_1, itemstack, f, i);
    }

    @Override
    public T read(ResourceLocation recipeId, PacketBuffer buffer) {
        String s = buffer.readString(32767);
        Ingredient ingredient_0 = Ingredient.read(buffer);
        Ingredient ingredient_1 = Ingredient.read(buffer);
        ItemStack itemstack = buffer.readItemStack();
        float f = buffer.readFloat();
        int i = buffer.readVarInt();

        return this.factory.create(recipeId, s, ingredient_0, ingredient_1, itemstack, f, i);
    }

    @Override
    public void write(PacketBuffer buffer, T recipe) {
        buffer.writeString(recipe.group);
        recipe.ingredient_0.write(buffer);
        recipe.ingredient_1.write(buffer);
        buffer.writeItemStack(recipe.result);
        buffer.writeFloat(recipe.experience);
        buffer.writeVarInt(recipe.cookTime);
    }

    public interface IFactory<T extends AbstractSmelterRecipe> {
        T create(ResourceLocation resourceLocation, String group, Ingredient ingredient_0, Ingredient ingredient_1, ItemStack result, float experience, int cookTime);
    }
}