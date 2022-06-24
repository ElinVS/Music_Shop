package Instruments;

import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;

public class Trumpet extends InstrumentStock {


    private int numberOfValves;


    public Trumpet(String nameOfInstrument,InstrumentType instrumentType, MaterialType materialType,  String brand, String sound,int sellingPrice, int buyingPrice, int numberOfValves) {
        super(nameOfInstrument,instrumentType, materialType, brand, sound, sellingPrice, buyingPrice);
        this.numberOfValves = numberOfValves;
    }


    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }


}
