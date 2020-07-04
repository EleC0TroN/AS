package com.electron.alloyssmelter.items;

import com.electron.alloyssmelter.ModConfigs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MeltingCoreItem extends Item {
    public MeltingCoreItem(Properties properties) {
        super(properties);
    }
    @Override
    public int getBurnTime(ItemStack itemStack) {
        return ModConfigs.COMMON.balance.melting_core_fuel.get();
    }
}