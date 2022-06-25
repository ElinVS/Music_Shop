package Instruments;

import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;

public class Trumpet extends Instrument{

    private int numberOfValves;

    public Trumpet( String itemDescription, double sellingPrice, double buyingPrice, InstrumentType instrumentType, MaterialType materialType, String brand, String sound, int numberOfValves) {
        super(itemDescription, sellingPrice, buyingPrice, instrumentType, materialType, brand, sound);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    @Override
    public String playInstrument() {
        return "The " + getItemDescription().toLowerCase() + " sounds like this: " + getSound().toLowerCase();
    }

    @Override
    public double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }
}
