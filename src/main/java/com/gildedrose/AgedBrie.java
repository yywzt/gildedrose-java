package com.gildedrose;

import static com.gildedrose.GildedRose.AGED_BRIE;
import static com.gildedrose.GildedRose.MAX_QUALITY;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    protected boolean isAgedBrie() {
        return true;
    }

    @Override
    protected void updateQualityAfterExpiration() {
        if (quality < MAX_QUALITY) {
            quality = quality + 1;
        }
    }

    @Override
    protected void updateQuality() {
        if (quality < MAX_QUALITY) {
            quality = quality + 1;

            if (isBackStage()) {
                if (sellIn < 11) {
                    if (quality < MAX_QUALITY) {
                        quality = quality + 1;
                    }
                }

                if (sellIn < 6) {
                    if (quality < MAX_QUALITY) {
                        quality = quality + 1;
                    }
                }
            }
        }
    }
}
