package com.gildedrose;

public class BackstagePass extends Item {

    public BackstagePass(int sell_in, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sell_in, quality);
    }

    @Override
    protected boolean isBackstagePass() {
        return true;
    }

    @Override
    protected void updateQualityAfterExpiration() {
        quality = quality - quality;
    }
}
