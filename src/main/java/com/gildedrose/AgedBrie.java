package com.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    protected boolean isAgedBrie() {
        return true;
    }

    @Override
    public void updateQualityExpiration() {
        increaseQuality();
    }

    @Override
    protected void updateQuality() {
        tincreaseQuality();
    }

    private void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
