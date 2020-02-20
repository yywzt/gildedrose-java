package com.gildedrose;

public class Backstage extends Item {

    public Backstage(int sellIn, int quality) {
        super(GildedRose.BACKSTAGE, sellIn, quality);
    }

    @Override
    protected boolean isBackStage() {
        return true;
    }

    @Override
    protected void updateQualityAfterExpiration() {
        super.updateQualityAfterExpiration();
    }
}
