package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;


public abstract class Instrument implements IPlay, ISell {

    private String nameOfInstrument;
    private InstrumentType instrumentType;
    private MaterialType materialType;

    private String brand;
    private String sound;

    private double sellingPrice;
    private double buyingPrice;

    public Instrument(String nameOfInstrument, InstrumentType instrumentType, MaterialType materialType, String brand, String sound, double sellingPrice, double buyingPrice) {
        this.nameOfInstrument = nameOfInstrument;
        this.instrumentType = instrumentType;
        this.materialType = materialType;
        this.brand = brand;
        this.sound = sound;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
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

    public String getNameOfInstrument() {
        return nameOfInstrument;
    }

    public void setNameOfInstrument(String nameOfInstrument) {
        this.nameOfInstrument = nameOfInstrument;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public String getBrand() {
        return brand;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String playInstrument() {
        return "The " + getNameOfInstrument().toLowerCase() + " sounds like this: " + getSound().toLowerCase();
    }



}
