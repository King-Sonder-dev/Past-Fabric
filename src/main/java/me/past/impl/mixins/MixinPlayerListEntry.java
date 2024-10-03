/*
package me.past.impl.mixins;

import me.past.Past;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.mojang.authlib.GameProfile;

import java.util.UUID;

@Mixin(PlayerListEntry.class)
public abstract class MixinPlayerListEntry {

    @Shadow
    public abstract GameProfile getProfile(); // Using GameProfile to get UUID

    @Inject(method = "getSkinTextures", at = @At("TAIL"), cancellable = true)
    public void getSkinTexture(CallbackInfoReturnable<ResourceLocation> callbackInfoReturnable) {
        UUID uuid = getProfile().getId(); // Fetching UUID from GameProfile

        if (Past.capesManager.hasCape(uuid)) {
            callbackInfoReturnable.setReturnValue(new Identifier("pastclient", "textures/capes/pastcape.png"));
        }
    }
}


 */