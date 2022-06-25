package Accessories;

import MusicShop.ShopItem;

public class Bow extends ShopItem {

    public Bow(String itemDescription, double sellingPrice, double buyingPrice) {
        super(itemDescription, sellingPrice, buyingPrice);
    }

    @Override
    public double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }
}
