package com.electron.alloyssmelter;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.fml.common.Mod;
import org.apache.commons.lang3.tuple.Pair;

@Mod.EventBusSubscriber(modid = AlloysSmelter.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModConfigs {
    public static final ForgeConfigSpec COMMON_SPEC;
    public static final CommonConfig COMMON;
    static {
        final Pair<CommonConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(CommonConfig::new);
        COMMON = specPair.getLeft();
        COMMON_SPEC = specPair.getRight();

    }
    public static class CommonConfig {
        public final Balance balance;
        public CommonConfig(final ForgeConfigSpec.Builder builder) {
            balance = new Balance(builder);
        }
        public static class Balance {
            public static String name = "general";
            public static ConfigValue<Boolean> dev_mode;
            public static ConfigValue<Integer> melting_core_fuel;

            public Balance(ForgeConfigSpec.Builder builder) {
                builder.push(name);
                dev_mode = builder
                        .comment("Alloys without installing mods")
                        .define("dev_mode", false);

                melting_core_fuel = builder
                        .comment("Molten Core Burn Time")
                        .defineInRange("melting_core_fuel", 2000, 0, 20000);

                builder.pop();
            }
        }
    }
}

