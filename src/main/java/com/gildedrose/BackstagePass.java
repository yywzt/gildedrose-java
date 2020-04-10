package com.gildedrose;

public class BackstagePass extends Item {

    public BackstagePass(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    @Override
    public void updateQualityWhenExpried() {
        quality = 0;
    }

    @Override
    public void updateQualityNormal() {
        if (quality < 50) {
            increaseQuality();

            if (sellIn < 11) {
                if (quality < 50) {
                    increaseQuality();
                }
            }

            if (sellIn < 6) {
                if (quality < 50) {
                    increaseQuality();
                }
            }
        }
    }


}
