package edu.teamrocket.domain;

public class AgedBrie extends NormalItem{
    public AgedBrie(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() < 50) {
            if (this.getSellIn() <= 0) {
                this.computeQuality(Math.min(this.getQuality() + 2, 50));
            } else {
                this.computeQuality(this.getQuality() + 1);
            }
        }
        this.setSellIn(this.getSellIn() - 1);
    }
}