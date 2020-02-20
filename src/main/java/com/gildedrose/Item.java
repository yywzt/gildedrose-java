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

    void updateQuality() {
        if (!isAgedBrie()
                && !name.equals(BACKSTAGE)) {
            if (quality > MIN_QUALITY) {
                if (!name.equals(SULFURAS)) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < MAX_QUALITY) {
                quality = quality + 1;

                if (name.equals(BACKSTAGE)) {
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

        if (!name.equals(SULFURAS)) {
            sellIn = sellIn - 1;
        }

        if (sellIn < MIN_SELL_IN) {
            if (!isAgedBrie()) {
                if (!name.equals(BACKSTAGE)) {
                    if (quality > MIN_QUALITY) {
                        if (!name.equals(SULFURAS)) {
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
    }

    private boolean isAgedBrie() {
        return name.equals(AGED_BRIE);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
