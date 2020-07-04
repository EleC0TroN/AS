package com.electron.alloyssmelter;

import com.electron.alloyssmelter.items.AlloysIngotItem;
import com.electron.alloyssmelter.items.AlloysSwordItem;
import com.electron.alloyssmelter.items.MeltingCoreItem;
import com.electron.alloyssmelter.items.ModMaterials;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    public static final Item MELTING_CORE = new MeltingCoreItem(new Item.Properties().group(ItemGroup.MISC));

    public static final Item BRONZE_INGOT = new AlloysIngotItem(new Item.Properties().group(AlloysSmelter.ALLOYS), 0);
    public static final Item BRONZE_SWORD = new AlloysSwordItem(ModMaterials.BRONZE, 3, -2.4f, 0, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final AxeItem BRONZE_AXE = new AxeItem(ModMaterials.BRONZE, 6f, -3.1f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final ShovelItem BRONZE_SHOVEL = new ShovelItem(ModMaterials.BRONZE, 1.5f, -3f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final HoeItem BRONZE_HOE = new HoeItem(ModMaterials.BRONZE,-2, -1.0F, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final PickaxeItem BRONZE_PICKAXE = new PickaxeItem(ModMaterials.BRONZE, 1, -2.8f, new Item.Properties().group(AlloysSmelter.ALLOYS));

    public static final Item FERRTHRIL_INGOT = new AlloysIngotItem(new Item.Properties().group(AlloysSmelter.ALLOYS), 2);
    public static final Item FERRTHRIL_SWORD = new AlloysSwordItem(ModMaterials.FERRTHRIL, 3, -2.4f, 5, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final AxeItem FERRTHRIL_AXE = new AxeItem(ModMaterials.FERRTHRIL, 6f, -3.1f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final ShovelItem FERRTHRIL_SHOVEL = new ShovelItem(ModMaterials.FERRTHRIL, 1.5f, -3f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final HoeItem FERRTHRIL_HOE = new HoeItem(ModMaterials.FERRTHRIL,-3, 0.0F, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final PickaxeItem FERRTHRIL_PICKAXE = new PickaxeItem(ModMaterials.FERRTHRIL, 1, -2.8f, new Item.Properties().group(AlloysSmelter.ALLOYS));

    public static final Item HARDENED_NETHERITE_INGOT = new AlloysIngotItem(new Item.Properties().group(AlloysSmelter.ALLOYS), 3);
    public static final Item HARDENED_NETHERITE_SWORD = new AlloysSwordItem(ModMaterials.HARDENED_NETHERITE, 3, -3.0f, 0, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final AxeItem HARDENED_NETHERITE_AXE = new AxeItem(ModMaterials.HARDENED_NETHERITE, 6f, -3.1f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final ShovelItem HARDENED_NETHERITE_SHOVEL = new ShovelItem(ModMaterials.HARDENED_NETHERITE, 1.5f, -3f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final HoeItem HARDENED_NETHERITE_HOE = new HoeItem(ModMaterials.HARDENED_NETHERITE,-4, -3.0F, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final PickaxeItem HARDENED_NETHERITE_PICKAXE = new PickaxeItem(ModMaterials.HARDENED_NETHERITE, 1, -2.8f, new Item.Properties().group(AlloysSmelter.ALLOYS));

    public static final Item MAGNITIC_GOLD_INGOT = new AlloysIngotItem(new Item.Properties().group(AlloysSmelter.ALLOYS), 0);
    public static final Item MAGNITIC_GOLD_SWORD = new AlloysSwordItem(ModMaterials.MAGNITIC_GOLD, 4, -2.0f, 0, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final AxeItem MAGNITIC_GOLD_AXE = new AxeItem(ModMaterials.MAGNITIC_GOLD, 6f, -3.1f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final ShovelItem MAGNITIC_GOLD_SHOVEL = new ShovelItem(ModMaterials.MAGNITIC_GOLD, 1.5f, -3f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final HoeItem MAGNITIC_GOLD_HOE = new HoeItem(ModMaterials.MAGNITIC_GOLD,0, 0.0F, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final PickaxeItem MAGNITIC_GOLD_PICKAXE = new PickaxeItem(ModMaterials.MAGNITIC_GOLD, 1, -2.8f, new Item.Properties().group(AlloysSmelter.ALLOYS));

    public static final Item NETHERENDIUM_INGOT = new AlloysIngotItem(new Item.Properties().group(AlloysSmelter.ALLOYS), 3);
    public static final Item NETHERENDIUM_SWORD = new AlloysSwordItem(ModMaterials.NETHERENDIUM, 3, -2.4f, 0, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final AxeItem NETHERENDIUM_AXE = new AxeItem(ModMaterials.NETHERENDIUM, 6f, -3.1f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final ShovelItem NETHERENDIUM_SHOVEL = new ShovelItem(ModMaterials.NETHERENDIUM, 1.5f, -3f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final HoeItem NETHERENDIUM_HOE = new HoeItem(ModMaterials.NETHERENDIUM,-4, -2.5F, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final PickaxeItem NETHERENDIUM_PICKAXE = new PickaxeItem(ModMaterials.NETHERENDIUM, 1, -2.8f, new Item.Properties().group(AlloysSmelter.ALLOYS));

    public static final Item ROSE_GOLD_INGOT = new AlloysIngotItem(new Item.Properties().group(AlloysSmelter.ALLOYS), 1);
    public static final Item ROSE_GOLD_SWORD = new AlloysSwordItem(ModMaterials.ROSE_GOLD, 4, -2.0f, 10, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final AxeItem ROSE_GOLD_AXE = new AxeItem(ModMaterials.ROSE_GOLD, 6f, -3.1f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final ShovelItem ROSE_GOLD_SHOVEL = new ShovelItem(ModMaterials.ROSE_GOLD, 1.5f, -3f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final HoeItem ROSE_GOLD_HOE = new HoeItem(ModMaterials.ROSE_GOLD,0,0.0F, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final PickaxeItem ROSE_GOLD_PICKAXE = new PickaxeItem(ModMaterials.ROSE_GOLD, 1, -2.8f, new Item.Properties().group(AlloysSmelter.ALLOYS));

    public static final Item TUNGSTANTIUM_INGOT = new AlloysIngotItem(new Item.Properties().group(AlloysSmelter.ALLOYS), 2);
    public static final Item TUNGSTANTIUM_SWORD = new AlloysSwordItem(ModMaterials.TUNGSTANTIUM, 3, -2.0f, 5, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final AxeItem TUNGSTANTIUM_AXE = new AxeItem(ModMaterials.TUNGSTANTIUM, 6f, -3.1f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final ShovelItem TUNGSTANTIUM_SHOVEL = new ShovelItem(ModMaterials.TUNGSTANTIUM, 1.5f, -3f, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final HoeItem TUNGSTANTIUM_HOE = new HoeItem(ModMaterials.TUNGSTANTIUM,-3, -2.0F, new Item.Properties().group(AlloysSmelter.ALLOYS));
    public static final PickaxeItem TUNGSTANTIUM_PICKAXE = new PickaxeItem(ModMaterials.TUNGSTANTIUM, 1, -2.8f, new Item.Properties().group(AlloysSmelter.ALLOYS));

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerItems(RegistryEvent.Register<Item> event) {
        boolean i = ModConfigs.COMMON.balance.dev_mode.get();
        registerItem(MELTING_CORE, "melting_core");

        registerItem(MAGNITIC_GOLD_INGOT, "magnitic_gold_ingot");
        registerItem(MAGNITIC_GOLD_SWORD, "magnitic_gold_sword");
        registerItem(MAGNITIC_GOLD_AXE, "magnitic_gold_axe");
        registerItem(MAGNITIC_GOLD_SHOVEL, "magnitic_gold_shovel");
        registerItem(MAGNITIC_GOLD_HOE, "magnitic_gold_hoe");
        registerItem(MAGNITIC_GOLD_PICKAXE, "magnitic_gold_pickaxe");

        if (ModList.get().getModContainerById("endreborn").isPresent() || i) {
            registerItem(HARDENED_NETHERITE_INGOT, "hardened_netherite_ingot");
            registerItem(HARDENED_NETHERITE_SWORD, "hardened_netherite_sword");
            registerItem(HARDENED_NETHERITE_AXE, "hardened_netherite_axe");
            registerItem(HARDENED_NETHERITE_SHOVEL, "hardened_netherite_shovel");
            registerItem(HARDENED_NETHERITE_HOE, "hardened_netherite_hoe");
            registerItem(HARDENED_NETHERITE_PICKAXE, "hardened_netherite_pickaxe");

            registerItem(NETHERENDIUM_INGOT, "netherendium_ingot");
            registerItem(NETHERENDIUM_SWORD, "netherendium_sword");
            registerItem(NETHERENDIUM_AXE, "netherendium_axe");
            registerItem(NETHERENDIUM_SHOVEL, "netherendium_shovel");
            registerItem(NETHERENDIUM_HOE, "netherendium_hoe");
            registerItem(NETHERENDIUM_PICKAXE, "netherendium_pickaxe");

        }
        if (ModList.get().getModContainerById("simpleores").isPresent() || ModList.get().getModContainerById("flux").isPresent() || ModList.get().getModContainerById("bno").isPresent() || i) {
            registerItem(ROSE_GOLD_INGOT, "rose_gold_ingot");
            registerItem(ROSE_GOLD_SWORD, "rose_gold_sword");
            registerItem(ROSE_GOLD_AXE, "rose_gold_axe");
            registerItem(ROSE_GOLD_SHOVEL, "rose_gold_shovel");
            registerItem(ROSE_GOLD_HOE, "rose_gold_hoe");
            registerItem(ROSE_GOLD_PICKAXE, "rose_gold_pickaxe");

        }
        if (ModList.get().getModContainerById("simpleores").isPresent() || ModList.get().getModContainerById("bno").isPresent() || i) {
            registerItem(BRONZE_INGOT, "bronze_ingot");
            registerItem(BRONZE_SWORD, "bronze_sword");
            registerItem(BRONZE_AXE, "bronze_axe");
            registerItem(BRONZE_SHOVEL, "bronze_shovel");
            registerItem(BRONZE_HOE, "bronze_hoe");
            registerItem(BRONZE_PICKAXE, "bronze_pickaxe");
        }
        if (ModList.get().getModContainerById("simpleores").isPresent() || i) {
            registerItem(FERRTHRIL_INGOT, "ferrthril_ingot");
            registerItem(FERRTHRIL_SWORD, "ferrthril_sword");
            registerItem(FERRTHRIL_AXE, "ferrthril_axe");
            registerItem(FERRTHRIL_SHOVEL, "ferrthril_shovel");
            registerItem(FERRTHRIL_HOE, "ferrthril_hoe");
            registerItem(FERRTHRIL_PICKAXE, "ferrthril_pickaxe");


        }
        if ((ModList.get().getModContainerById("simpleores").isPresent() && ModList.get().getModContainerById("endreborn").isPresent()) || i) {
            registerItem(TUNGSTANTIUM_INGOT, "tungstantium_ingot");
            registerItem(TUNGSTANTIUM_SWORD, "tungstantium_sword");
            registerItem(TUNGSTANTIUM_AXE, "tungstantium_axe");
            registerItem(TUNGSTANTIUM_SHOVEL, "tungstantium_shovel");
            registerItem(TUNGSTANTIUM_HOE, "tungstantium_hoe");
            registerItem(TUNGSTANTIUM_PICKAXE, "tungstantium_pickaxe");
        }
    }
    private static void registerItem(Item item, String name) {
        item.setRegistryName(new ResourceLocation(AlloysSmelter.MODID, name));
        ForgeRegistries.ITEMS.register(item);
    }
}
