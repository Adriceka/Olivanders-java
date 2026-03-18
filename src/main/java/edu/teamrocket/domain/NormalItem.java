package edu.teamrocket.domain;

public class NormalItem implements Updateable{

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

    public void setSellIn() {
        this.item.setSellIn();
    }

    @Override
    public void updateQuality() {

        if (this.item.getSellIn() > 0) {
            this.item.setQuality(this.item.getQuality() - 1);
            this.item.setSellIn();
        }
        else {
            this.item.setQuality(this.item.getQuality() - 2);
        }
    }

    protected void computeQuality(int quality) {
        this.item.setQuality(quality);
    }

    public String toString() {
        return this.getName() + ", " + this.getSellIn() + ", " + this.getQuality();
    }
}