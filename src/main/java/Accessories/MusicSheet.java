package Accessories;

import MusicShop.ShopItem;

public class MusicSheet extends ShopItem {

    private String scoreTitle;

    public MusicSheet(String itemDescription, double sellingPrice, double buyingPrice, String scoreTitle) {
        super(itemDescription, sellingPrice, buyingPrice);
        this.scoreTitle = scoreTitle;
    }

    public String getScoreTitle() {
        return scoreTitle;
    }

    @Override
    public double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }
}
