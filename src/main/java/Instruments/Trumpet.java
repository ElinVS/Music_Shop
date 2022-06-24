package Instruments;

import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String nameOfInstrument,InstrumentType instrumentType, MaterialType materialType,  String brand, String sound,int sellingPrice, int buyingPrice, int numberOfValves) {
        super(nameOfInstrument,instrumentType, materialType, brand, sound, sellingPrice, buyingPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }


    @Override
    public double calculateMarkUp(Double sellingPrice, Double buyingPrice) {
        return sellingPrice-buyingPrice;
    }
}
