package com.voxelwind.api.game.item.data;

import javax.annotation.Nonnull;

/**
 * This {@link ItemData} represents coal. In Minecraft, coal can either be regular or be charcoal. They are the same,
 * regardless.
 */
public class Coal implements ItemData {
    /**
     * Represents a regular coal item.
     */
    public static final Coal REGULAR = new Coal(false);
    /**
     * Represents a charcoal item.
     */
    public static final Coal CHARCOAL = new Coal(true);

    @Nonnull
    public static Coal of(short metadata) {
        if (metadata == 0 || metadata == 1) {
            return metadata == 0 ? REGULAR : CHARCOAL;
        }
        throw new IllegalArgumentException("Metadata value " + metadata + " is not valid");
    }

    private final boolean isCharcoal;

    private Coal(boolean isCharcoal) {
        this.isCharcoal = isCharcoal;
    }

    /**
     * Returns whether or not this item is charcoal.
     * @return whether or not this item is charcoal
     */
    public boolean isCharcoal() {
        return isCharcoal;
    }

    @Override
    public short toMetadata() {
        return (short) (isCharcoal ? 1 : 0);
    }
}
