package com.gildedrose;

import static com.gildedrose.GildedRose.*;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    void passOneDay() {
        updateQuality();

        updateSellIn();

        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    protected void updateQualityAfterExpiration() {
        if (isAgedBrie()) {
            if (quality < MAX_QUALITY) {
                quality = quality + 1;
            }
            return;
        }
        if (isBackStage()) {
            quality = 0;
            return;
        }
        if (quality > MIN_QUALITY) {
            quality = quality - 1;
        }
    }

    private boolean isExpired() {
        return sellIn < MIN_SELL_IN;
    }

    protected void updateSellIn() {
        if (isSulfuras()) {
            return;
        }
        sellIn = sellIn - 1;
    }

    protected void updateQuality() {
        if (isAgedBrie()
                || isBackStage()) {
            if (quality < MAX_QUALITY) {
                quality = quality + 1;

                if (isBackStage()) {
                    if (sellIn < 11) {
                        if (quality < MAX_QUALITY) {
                            quality = quality + 1;
                        }
                    }

                    if (sellIn < 6) {
                        if (quality < MAX_QUALITY) {
                            quality = quality + 1;
                        }
                    }
                }
            }
        } else {
            if (quality > MIN_QUALITY) {
                quality = quality - 1;
            }
        }
    }

    protected boolean isSulfuras() {
        return false;
    }

    protected boolean isBackStage() {
        return false;
    }

    protected boolean isAgedBrie() {
        return false;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
