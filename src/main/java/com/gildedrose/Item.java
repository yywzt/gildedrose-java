package com.gildedrose;

public class Item {

    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sellIn = sell_in;
        this.quality = quality;
    }

    protected void something() {
        updateQuality();

        updateSellIn();

        if (isExpired()) {
            updateQualityExpiration();
        }
    }

    protected void updateQualityExpiration() {
        if (isAgedBrie()) {
            if (quality < 50) {
                quality = quality + 1;
            }
        } else {
            if (isBackstgePass()) {
                quality = quality - quality;
            } else {
                if (quality > 0) {
                    if (isSulfuras()) {
                        return;
                    }
                    quality = quality - 1;
                }
            }
        }
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void updateQuality() {
        if (!isAgedBrie()
                && !isBackstgePass()) {
            if (quality > 0) {
                if (!isSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackstgePass()) {
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
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    protected boolean isSulfuras() {
        return false;
    }

    protected boolean isBackstgePass() {
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
