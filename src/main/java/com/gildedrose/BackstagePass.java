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

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;

            if (isBackstagePass()) {
                if (sell_in < 11) {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }

                if (sell_in < 6) {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }
            }
        }
    }
}
