package com.gildedrose;

import static com.gildedrose.GildedRose.AGED_BRIE;
import static com.gildedrose.GildedRose.MAX_QUALITY;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpiration() {
        increaseQuality();
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
    }
}
