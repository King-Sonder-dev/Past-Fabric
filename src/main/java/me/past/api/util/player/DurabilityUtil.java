package me.past.api.util.player;

import net.minecraft.item.ItemStack;

public class DurabilityUtil {
    public static int getItemDamage(ItemStack stack) {
        return stack.getMaxDamage() - stack.getDamage();
    }

    public static float getDamageInPercent(ItemStack stack) {
        return (getItemDamage(stack) / (float) stack.getMaxDamage()) * 100;
    }

    public static int getRoundedDamage(ItemStack stack) {
        return (int) getDamageInPercent(stack);
    }
}