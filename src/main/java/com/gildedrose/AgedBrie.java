package com.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public boolean isAgedBrie() {
        return true;
    }
}
