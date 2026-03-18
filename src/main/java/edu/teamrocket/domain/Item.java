package edu.teamrocket.domain;


public class Item{
    private final String name;
    private int quality;
    private int sellIn;
       
    public Item(String name, int quality, int sellIn) {

        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;

    }
       protected String getName() {
           return name;
       }

       protected int getQuality() {
           return quality;
       }

       protected void setQuality(int quality) {
           this.quality = quality;
       }

       protected int getSellIn() {
           return sellIn;
       }

       protected void setSellIn() {
           this.sellIn = this.getSellIn() - 1;
       }

       @Override
       public String toString() {
        return "Item [name=" + name + ", quality=" + quality + ", sellIn=" + sellIn + "]";
       }
}