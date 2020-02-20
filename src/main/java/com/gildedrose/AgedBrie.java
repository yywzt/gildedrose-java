package com.gildedrose;

import static com.gildedrose.GildedRose.AGED_BRIE;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    protected boolean isAgedBrie() {
        return true;
    }
}
