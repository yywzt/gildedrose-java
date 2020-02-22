package com.gildedrose;

public class Sulfuras extends Item {

    public Sulfuras(int sell_in, int quality) {
        super(SULFURAS_HAND_OF_RAGNAROS, sell_in, quality);
    }

    @Override
    protected boolean isSulfuras() {
        return true;
    }

    @Override
    protected void updateSellIn() {

    }

    @Override
    protected void updateQualityAfterExpiration() {

    }

    @Override
    protected void updateQuality() {

    }
}
