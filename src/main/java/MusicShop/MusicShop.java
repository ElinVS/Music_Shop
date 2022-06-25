package MusicShop;

import Behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;
    private Till till;

    public MusicShop(ArrayList<ISell> stock, Till till) {
        this.stock = stock;
        this.till = till;
    }

    public int getStock() {
        return stock.size();
    }

    public Till getTill() {
        return till;
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public void removeItem(ISell item){
        stock.remove(item);
    }


}
