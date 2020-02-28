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
    public void updateQualityAfterExpiration() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    public void udpateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
