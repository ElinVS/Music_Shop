package Instruments;

import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;

public class Cello extends Instrument {

    private boolean comesWithABow;

    public Cello(String nameOfInstrument, InstrumentType instrumentType, MaterialType materialType, String brand, String sound, double sellingPrice, double buyingPrice, boolean comesWithABow) {
        super(nameOfInstrument, instrumentType, materialType, brand, sound, sellingPrice, buyingPrice);
        this.comesWithABow = comesWithABow;
    }

    public boolean isComesWithABow() {
        return comesWithABow;
    }

    public void setComesWithABow(boolean comesWithABow) {
        this.comesWithABow = comesWithABow;
    }

    @Override
    public double calculateMarkUp(Double sellingPrice, Double buyingPrice) {
        return sellingPrice - buyingPrice;
    }
}
