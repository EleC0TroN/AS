package com.electron.alloyssmelter;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AlloysSmelter.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AlloysTab extends ItemGroup {
    public AlloysTab() {
        super("alloys");
    }
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.IRON_INGOT);
    }
}
