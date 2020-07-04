package com.electron.alloyssmelter.blocks;

import com.electron.alloyssmelter.ModTileEntities;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class SmelterTileEntity extends AbstractSmelterTileEntity {
    public SmelterTileEntity() {
        super(ModTileEntities.TILE_ENTITY_ALLOYS_SMELTER.get(), SmelterRecipe.ALLOY_RECIPE);
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.smelter");
    }

    protected Container createMenu(int id, PlayerInventory player) {
        return new SmelterContainer(id, player, this, this.furnaceData);
    }
}
