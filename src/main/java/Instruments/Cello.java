package Instruments;

import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;

public class Cello extends Instrument{

    private boolean soldWithBow;

    public Cello(String itemDescription, double sellingPrice, double buyingPrice, InstrumentType instrumentType, MaterialType materialType, String brand, String sound, boolean soldWithBow) {
        super(itemDescription, sellingPrice, buyingPrice, instrumentType, materialType, brand, sound);
        this.soldWithBow = soldWithBow;
    }

    public boolean isSoldWithBow() {
        return soldWithBow;
    }

    @Override
    public String playInstrument() {
        return "The " + getItemDescription() + " sounds like this: " + getSound();
    }

    @Override
    public double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }
}
