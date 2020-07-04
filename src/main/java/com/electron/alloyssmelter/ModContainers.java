package com.electron.alloyssmelter;

import com.electron.alloyssmelter.blocks.SmelterContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, AlloysSmelter.MODID);

    public static final RegistryObject<ContainerType<SmelterContainer>> SMELTER_CONTANER = CONTAINERS.register("alloys_smelter", () -> IForgeContainerType.create((windowId, inv, data) -> { return new SmelterContainer(windowId, inv); }));
}
