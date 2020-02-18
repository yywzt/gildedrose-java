package com.gildedrose;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;
    public static final int MIN_SELL_IN = 0;
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            something(item);
        }
    }

    private void something(Item item) {
        if (!item.name.equals(AGED_BRIE)
                && !item.name.equals(BACKSTAGE)) {
            if (item.quality > MIN_QUALITY) {
                if (!item.name.equals(SULFURAS)) {
                    item.quality = item.quality - 1;
                }
            }
        } else {
            if (item.quality < MAX_QUALITY) {
                item.quality = item.quality + 1;

                if (item.name.equals(BACKSTAGE)) {
                    if (item.sellIn < 11) {
                        if (item.quality < MAX_QUALITY) {
                            item.quality = item.quality + 1;
                        }
                    }

                    if (item.sellIn < 6) {
                        if (item.quality < MAX_QUALITY) {
                            item.quality = item.quality + 1;
                        }
                    }
                }
            }
        }

        if (!item.name.equals(SULFURAS)) {
            item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < MIN_SELL_IN) {
            if (!item.name.equals(AGED_BRIE)) {
                if (!item.name.equals(BACKSTAGE)) {
                    if (item.quality > MIN_QUALITY) {
                        if (!item.name.equals(SULFURAS)) {
                            item.quality = item.quality - 1;
                        }
                    }
                } else {
                    item.quality = 0;
                }
            } else {
                if (item.quality < MAX_QUALITY) {
                    item.quality = item.quality + 1;
                }
            }
        }
    }
}
