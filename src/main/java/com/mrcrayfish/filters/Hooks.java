package com.mrcrayfish.filters;

import net.minecraft.client.gui.DisplayEffectsScreen;
import net.minecraft.client.gui.screen.inventory.CreativeScreen;
import net.minecraft.item.ItemGroup;

/**
 * Author: MrCrayfish
 */
public class Hooks
{
    public static int getPotionEffectOffset(DisplayEffectsScreen screen)
    {
        if (screen instanceof CreativeScreen && Filters.get().hasFilters(ItemGroup.GROUPS[((CreativeScreen) screen).getSelectedTabIndex()]))
        {
            return 172;
        }
        return 124;
    }

    public static int getEffectsGuiOffset(DisplayEffectsScreen screen)
    {
        if (screen instanceof CreativeScreen && Filters.get().hasFilters(ItemGroup.GROUPS[((CreativeScreen) screen).getSelectedTabIndex()]))
        {
            return 182;
        }
        return 160;
    }
}
