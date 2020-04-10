package com.gildedrose;

public class Item {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality() {
        updateQualityNormal();
        updateSellIn();
        if (isExpried()) {
            updateQualityWhenExpried();
        }
    }

    public void increaseQuality() {
        quality = quality + 1;
    }

    public void updateQualityWhenExpried() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    public void updateSellIn() {
        sellIn = sellIn - 1;
    }

    public void updateQualityNormal() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private boolean isExpried() {
        return sellIn < 0;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
