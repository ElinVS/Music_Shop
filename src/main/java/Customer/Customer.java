package Customer;

import Accessories.Bow;
import Behaviours.ISell;
import Instruments.Cello;
import MusicShop.ShopItem;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<ISell> shoppingBag;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.shoppingBag = new ArrayList<>();
    }

    public int getShoppingBag() {
        return shoppingBag.size();
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public void addItem(ISell item) {
        shoppingBag.add(item);
    }

    public void buyItem(ShopItem item) {
        if(getWallet() > item.getSellingPrice()){
            addItem(item);
            wallet -= item.getSellingPrice();

        }


    }


}
