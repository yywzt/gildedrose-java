package com.gildedrose;

import static com.gildedrose.GildedRose.MAX_QUALITY;
import static com.gildedrose.GildedRose.MIN_QUALITY;

public class Backstage extends Item {

    public Backstage(int sellIn, int quality) {
        super(GildedRose.BACKSTAGE, sellIn, quality);
    }

    @Override
    protected boolean isBackStage() {
        return true;
    }

    @Override
    protected void updateQualityAfterExpiration() {
        quality = 0;
    }

    @Override
    protected void updateQuality() {
        if (isBackStage()) {
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
            return;
        }
    }
}
