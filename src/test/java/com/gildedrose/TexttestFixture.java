package com.gildedrose;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println(generateBaseline());
    }

    public static String generateBaseline() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        printStream.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                Item.createAgedBrie(2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                createSulfuras(80, 0), //
                createSulfuras(80, -1),
                createBackStage(15, 20),
                createBackStage(10, 49),
                createBackStage(5, 49),
                createBackStage(1, 20),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 3; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (Item item : items) {
                printStream.println(item);
            }
            printStream.println();
            app.updateQuality();
        }
        return outputStream.toString();
    }

    private static Item createBackStage(int sellIn, int quality) {
        return new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    private static Item createSulfuras(int quality, int sellIn) {
        return new Item("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

}
