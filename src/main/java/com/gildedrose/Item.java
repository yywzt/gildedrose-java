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
        decreaseQuatlity();
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void updateQuality() {
        decreaseQuatlity();
    }

    private void decreaseQuatlity() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
