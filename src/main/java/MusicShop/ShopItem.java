package MusicShop;

import Behaviours.ISell;

public abstract class ShopItem implements ISell {

    private String itemDescription;
    private double sellingPrice;
    private double buyingPrice;

    public ShopItem(String itemDescription, double sellingPrice, double buyingPrice) {
        this.itemDescription = itemDescription;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }


}
