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
        decreaseQuality();
    }

    private boolean isExpired() {
        return sellIn < MIN_SELL_IN;
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void updateQuality() {
        decreaseQuality();
    }

    private void decreaseQuality() {
        if (quality > MIN_QUALITY) {
            quality = quality - 1;
        }
    }

    protected void increaseQuality() {
        if (quality < MAX_QUALITY) {
            quality = quality + 1;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
