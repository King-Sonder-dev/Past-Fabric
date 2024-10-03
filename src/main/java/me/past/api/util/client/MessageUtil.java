package me.past.api.util.client;

import net.minecraft.util.Formatting;
import net.minecraft.entity.player.PlayerEntity;

import static me.past.api.util.client.Util.mc;

public class MessageUtil {
    private static final PlayerEntity player = mc.player;

    public static String prefix = Formatting.GRAY + "[" + Formatting.RED + "Past Client" + Formatting.GRAY + "]";
    public static String entityalertPrefix = Formatting.GRAY + "[" + Formatting.DARK_RED + "EntityAlert" + Formatting.GRAY + "]";
    public static String weaknessAlertPrefix = Formatting.GRAY + "[" + Formatting.DARK_RED + "WeaknessDetect" + Formatting.GRAY + "]";
    public static String bedAuraPrefix = Formatting.GRAY + "[" + Formatting.DARK_RED + "BedAura" + Formatting.GRAY + "]";
    public static String surroundPrefix = Formatting.GRAY + "[" + Formatting.DARK_RED + "Surround" + Formatting.GRAY + "]";
    public static String autoBuilderPrefix = Formatting.GRAY + "[" + Formatting.DARK_RED + "AutoBuilder" + Formatting.GRAY + "]";
    public static String friendsPrefix = Formatting.GRAY + "[" + Formatting.DARK_RED + "Friends" + Formatting.GRAY + "]";
    public static String autoCrystalPrefix = Formatting.GRAY + "[" + Formatting.DARK_RED + "AutoCrystal" + Formatting.GRAY + "]";
    public static String autoInsultPrefix = Formatting.GRAY + "[" + Formatting.DARK_RED + "AutoInsult" + Formatting.GRAY + "]";
    public static String durabilityWarnPrefix = Formatting.GRAY + "[" + Formatting.DARK_RED + "DurabilityWarn" + Formatting.GRAY + "]";

    public static void sendRawMessage(String message) {
        if (mc.player != null) {
            mc.player.networkHandler.sendChatMessage(message);
        }
    }

    public static void sendMessagePrefix(String message) {
        sendRawMessage(prefix + " " + message);
    }

    public static void sendEntityAlertMessage(String message) {
        sendMessagePrefix(entityalertPrefix + " " + message);
    }

    public static void sendWeaknessAlertMessage(String message) {
        sendMessagePrefix(weaknessAlertPrefix + " " + message);
    }

    public static void sendBedAuraMessage(String message) {
        sendMessagePrefix(bedAuraPrefix + " " + message);
    }

    public static void sendSurroundMessage(String message) {
        sendMessagePrefix(surroundPrefix + " " + message);
    }

    public static void sendAutoBuilderMessage(String message) {
        sendMessagePrefix(autoBuilderPrefix + " " + message);
    }

    public static void sendFreindsMessage(String message) {
        sendMessagePrefix(friendsPrefix + " " + message);
    }

    public static void sendAutoCrystalMessage(String message) {
        sendMessagePrefix(autoCrystalPrefix + " " + message);
    }

    public static void sendAutoInsultMessage(String message) {
        sendMessagePrefix(autoInsultPrefix + " " + message);
    }

    public static void sendDurabilityWarnMessage(String message) {
        sendMessagePrefix(durabilityWarnPrefix + " " + message);
    }
}