package com.electron.alloyssmelter;

import com.electron.alloyssmelter.blocks.SmelterTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {
    public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, AlloysSmelter.MODID);

    public static final RegistryObject<TileEntityType<SmelterTileEntity>> TILE_ENTITY_ALLOYS_SMELTER = TILES.register("alloys_smelter", () -> TileEntityType.Builder.create(SmelterTileEntity::new, ModBlocks.ALLOYS_SMELTER.get()).build(null));

}
