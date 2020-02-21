package com.gildedrose;

public class Item {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
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
            if (!isAgedBrie()) {
                if (!isBackstagePass()) {
                    if (quality > 0) {
                        if (!isSulfuras()) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = 0;
                }
            } else {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }

    private void updateQuality() {
        if (isAgedBrie()
                || isBackstagePass()) {
                    if (quality < 50) {
                        quality = quality + 1;

                        if (isBackstagePass()) {
                            if (sellIn < 11) {
                                if (quality < 50) {
                                    quality = quality + 1;
                                }
                            }

                            if (sellIn < 6) {
                                if (quality < 50) {
                                    quality = quality + 1;
                                }
                            }
                        }
                    }
                    return;
                } else {
            if (quality > 0) {
                if (isSulfuras()) {
                    return;
                }
                quality = quality - 1;
            }
        }
    }

    private void updateSellIn() {
        if (isSulfuras()) {
            return;
        }
        sellIn = sellIn - 1;
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    private boolean isSulfuras() {
        return name.equals(SULFURAS_HAND_OF_RAGNAROS);
    }

    private boolean isBackstagePass() {
        return name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT);
    }

    private boolean isAgedBrie() {
        return name.equals(AGED_BRIE);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
