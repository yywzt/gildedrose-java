package com.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void updateQualityWhenExpried() {
        if (quality < 50) {
            increaseQuality();
        }
    }

    @Override
    public void updateQualityNormal() {
        if (quality < 50) {
            increaseQuality();
        }
    }
}
