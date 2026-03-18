package edu.teamrocket.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    
    List<Updateable> items = new ArrayList<>();

    public List<Updateable> inventory() {

        return this.items;
    }

    public void addItem(Updateable item) {
        inventory().add(item);
    }

    public void updateQuality() {
        for (Updateable item : inventory()) {
            item.updateQuality();
        }
    }

    public String toString(){
        return "" ;
    }
}

