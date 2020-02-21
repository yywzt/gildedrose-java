package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void passOneDay() {
        updateQuality();

        updateSellIn();

        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    protected void updateQualityAfterExpiration() {
        if (isAgedBrie()) {
            if (quality < 50) {
                quality = quality + 1;
            }
            return;
        }
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void updateQuality() {
        if (isAgedBrie()) {
            if (quality < 50) {
                quality = quality + 1;
            }
            return;
        }
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected boolean isBackstagePass() {
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
