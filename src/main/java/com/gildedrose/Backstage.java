package com.gildedrose;

public class Backstage extends Item {

    public Backstage(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    @Override
    protected boolean isBackstagePass() {
        return true;
    }
}
