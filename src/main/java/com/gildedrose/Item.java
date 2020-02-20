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

    private void updateQualityAfterExpiration() {
        if (!isAgedBrie()) {
            if (!isBackStage()) {
                if (quality > MIN_QUALITY) {
                    if (!isSulfuras()) {
                        quality = quality - 1;
                    }
                }
            } else {
                quality = 0;
            }
        } else {
            if (quality < MAX_QUALITY) {
                quality = quality + 1;
            }
        }
    }

    private boolean isExpired() {
        return sellIn < MIN_SELL_IN;
    }

    private void updateSellIn() {
        if (isSulfuras()) {
            return;
        }
        sellIn = sellIn - 1;
    }

    private void updateQuality() {
        if (!isAgedBrie()
                && !isBackStage()) {
            if (quality > MIN_QUALITY) {
                if (!isSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
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
