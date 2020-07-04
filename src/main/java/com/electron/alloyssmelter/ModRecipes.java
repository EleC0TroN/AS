package com.electron.alloyssmelter;

import com.electron.alloyssmelter.blocks.AlloyingRecipeSerializer;
import com.electron.alloyssmelter.blocks.SmelterRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(AlloysSmelter.MODID)
@Mod.EventBusSubscriber(modid = AlloysSmelter.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRecipes {
    public static final AlloyingRecipeSerializer<SmelterRecipe> SMELTER = null;

    @SubscribeEvent
    public static void registerRecipeSerializer(RegistryEvent.Register<IRecipeSerializer<?>> event) {
        IForgeRegistry<IRecipeSerializer<?>> registry = event.getRegistry();
        registry.register(new AlloyingRecipeSerializer<>(SmelterRecipe::new).setRegistryName(AlloysSmelter.MODID, "alloying"));
    }

}
