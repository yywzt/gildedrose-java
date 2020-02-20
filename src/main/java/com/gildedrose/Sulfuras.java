package com.gildedrose;

public class Sulfuras extends Item {

    public Sulfuras(int sellIn, int quality) {
        super(GildedRose.SULFURAS, sellIn, quality);
    }

    @Override
    protected boolean isSulfuras() {
        return true;
    }

    @Override
    protected void updateQuality() {

    }

    @Override
    protected void updateQualityAfterExpiration() {

    }

    @Override
    protected void updateSellIn() {

    }
}
