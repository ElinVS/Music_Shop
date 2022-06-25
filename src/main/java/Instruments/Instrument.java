package Instruments;

import Behaviours.IPlay;
import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;
import MusicShop.ShopItem;

public abstract class Instrument extends ShopItem implements IPlay {

    private InstrumentType instrumentType;
    private MaterialType materialType;
    private String brand;
    private String sound;

    public Instrument(String itemDescription, double sellingPrice, double buyingPrice, InstrumentType instrumentType, MaterialType materialType, String brand, String sound) {
        super(itemDescription, sellingPrice, buyingPrice);
        this.instrumentType = instrumentType;
        this.materialType = materialType;
        this.brand = brand;
        this.sound = sound;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public String getBrand() {
        return brand;
    }

    public String getSound() {
        return sound;
    }

}
