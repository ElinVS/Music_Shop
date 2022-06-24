package MusicShop;

import Behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;

    public MusicShop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }
}
