package com.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public boolean isAgedBrie() {
        return true;
    }

    @Override
    public void updateQualityWhenExpried() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    public void updateQualityNormal() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
