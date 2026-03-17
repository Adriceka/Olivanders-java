package edu.teamrocket.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    List<Updateable> items = new ArrayList<>();
    public GildedRose() {
    }

    public void addItem(Updateable item) {
        items.add(item);
    }

    public void updateQuality() {
        for (Updateable item : items) {
            item.updateQuality();
        }
    }

    public String toString(){
        return "";
    }

    public List<Updateable> getItems() {
        return items;
    }




}

