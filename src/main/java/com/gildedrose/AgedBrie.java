package com.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void updateQualityAfterExpiration() {
        addQuality();

    }

    @Override
    public void updateQuality() {
        addQuality();

    }

    private void addQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
