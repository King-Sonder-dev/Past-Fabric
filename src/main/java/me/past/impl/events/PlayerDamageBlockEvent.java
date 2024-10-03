package me.past.impl.events;


import me.past.api.event.Event;
import net.minecraft.block.FacingBlock;
import net.minecraft.util.math.BlockPos;

public class PlayerDamageBlockEvent extends Event {
    private BlockPos blockPos;
    private FacingBlock enumFacing;

    public PlayerDamageBlockEvent(BlockPos posBlock, FacingBlock directionFacing) {
        blockPos = posBlock;
        setDirection(directionFacing);
    }

    public BlockPos getPos() {
        return blockPos;
    }

    public FacingBlock getDirection() {
        return enumFacing;
    }

    public void setDirection(FacingBlock direction) {
        enumFacing = direction;
    }
}