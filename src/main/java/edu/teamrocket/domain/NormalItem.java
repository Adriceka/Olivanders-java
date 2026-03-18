package edu.teamrocket.domain;

public class NormalItem implements Updateable{

        private String name;
        private int quality;
        private int sellIn;
        private Item item;

    public NormalItem(String name, int quality, int sellIn) {

        this.item=new Item(name, quality, sellIn);

    }

    protected Item getItem() {
        return this.item;
    }

    public String getName() {
       return this.item.getName();
    }
    
    public int getQuality() {
        return this.item.getQuality();
    }

    public int getSellIn() {
        return this.item.getSellIn();
    }

    public void setSellIn(int sellIn) {
        this.item.setSellIn(sellIn);
    }

    @Override
    public void updateQuality() {

    }

    protected void computeQuality(int quality) {
        this.item.setQuality(quality);
    }

    public String toString() {
        return this.getName() + ", " + this.getSellIn() + ", " + this.getQuality();
    }
}