package edu.teamrocket.domain;

public class AgedBrie extends NormalItem{
    public AgedBrie(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() < 50) {
            this.computeQuality(this.getQuality() + 1);
        }
        
    }
}