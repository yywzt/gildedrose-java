package com.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(int sell_in, int quality) {
        super(AGED_BRIE, sell_in, quality);
    }

    @Override
    protected boolean isAgedBrie() {
        return true;
    }
}
