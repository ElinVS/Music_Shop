package MusicShop;

import Behaviours.ISell;
import Instruments.Trumpet;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;

    public MusicShop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public int getStockCount() {
        return stock.size();
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addItem(ISell item) {
        this.stock.add(item);

    }
}
