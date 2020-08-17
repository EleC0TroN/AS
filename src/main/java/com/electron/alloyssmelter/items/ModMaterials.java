package com.electron.alloyssmelter.items;

import com.electron.alloyssmelter.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModMaterials implements IItemTier {
    MAGNITIC_GOLD(0, 64, 12.0F, 0.0F, 18, () -> {
        return Ingredient.fromItems(ModItems.MAGNITIC_GOLD_INGOT);
    }),
    BRONZE(2, 230, 6.0F, 2.0F, 12, () -> {
        return Ingredient.fromItems(ModItems.BRONZE_INGOT);
    }),
    FERRTHRIL(3, 1361, 9.0F, 3.0F, 8, () -> {
        return Ingredient.fromItems(ModItems.FERRTHRIL_INGOT);
    }),
    HARDENED_NETHERITE(4, 2956, 9.0F, 4.0F, 0, () -> {
        return Ingredient.fromItems(ModItems.HARDENED_NETHERITE_INGOT);
    }),
    NETHERENDIUM(4, 2231, 10.0F, 4.5F, 10, () -> {
        return Ingredient.fromItems(ModItems.NETHERENDIUM_INGOT);
    }),
    ROSE_GOLD(0, 48, 11.0F, 0.0F, 24, () -> {
        return Ingredient.fromItems(ModItems.ROSE_GOLD_INGOT);
    }),
    TUNGSTANTIUM(3, 1681, 10.0F, 3.0F, 0, () -> {
        return Ingredient.fromItems(ModItems.TUNGSTANTIUM_INGOT);
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    private ModMaterials (int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}