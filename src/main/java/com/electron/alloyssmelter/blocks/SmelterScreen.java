package com.electron.alloyssmelter.blocks;

import com.electron.alloyssmelter.AlloysSmelter;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SmelterScreen extends AbstractSmelterScreen<SmelterContainer> {
    private static final ResourceLocation SMELTER_GUI_TEXTURES = new ResourceLocation(AlloysSmelter.MODID, "textures/gui/container/smelter.png");

    public SmelterScreen(SmelterContainer p_i51089_1_, PlayerInventory p_i51089_2_, ITextComponent p_i51089_3_) {
        super(p_i51089_1_, p_i51089_2_, p_i51089_3_, SMELTER_GUI_TEXTURES);
    }
}