package Accessories;

import Behaviours.ISell;

public abstract class Accessories implements ISell {

    private double sellingPrice;
    private double buyingPrice;

    private String nameOfAccessory;


    public Accessories(double sellingPrice, double buyingPrice, String nameOfAccessory) {
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.nameOfAccessory = nameOfAccessory;

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

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public String getNameOfAccessory() {
        return nameOfAccessory;
    }

    public void setNameOfAccessory(String nameOfAccessory) {
        this.nameOfAccessory = nameOfAccessory;
    }

    @Override
    public double calculateMarkUp(Double sellingPrice, Double buyingPrice) {
        return sellingPrice - buyingPrice;
    }
}
