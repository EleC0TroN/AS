package com.electron.alloyssmelter;

import com.electron.alloyssmelter.blocks.SmelterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AlloysSmelter.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlloysSmelter.MODID);

    public static final RegistryObject<BlockItem> ALLOYS_SMELTER_ITEM = ITEMS.register("alloys_smelter", () -> new BlockItem(ModBlocks.ALLOYS_SMELTER.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<SmelterBlock> ALLOYS_SMELTER = BLOCKS.register("alloys_smelter", () -> new SmelterBlock(Block.Properties.create(Material.ROCK, MaterialColor.OBSIDIAN).hardnessAndResistance(40.0f, 6000.0f).sound(SoundType.STONE)));
}
