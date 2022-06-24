package InstrumentTests;

import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Trumpet",InstrumentType.BRASS, MaterialType.BRASS,"Bach", "Trumpety trump", 75, 50,4);
    }

    @Test
    public void hasAName(){
        assertEquals("Trumpet", trumpet.getNameOfInstrument());
    }

    @Test
    public void hasAInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void hasAMaterialType(){
        assertEquals(MaterialType.BRASS, trumpet.getMaterialType());
    }

    @Test
    public void hasABrand(){
        assertEquals("Bach", trumpet.getBrand());
    }

    @Test
    public void hasASound(){
        assertEquals("Trumpety trump", trumpet.getSound());
    }

    @Test
    public void hasANumberOfValves(){
        assertEquals(4, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("The trumpet sounds like this: trumpety trump", trumpet.playInstrument());
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(75,trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void hasABuyingPrice(){
        assertEquals(50,trumpet.getBuyingPrice(), 0.01);
    }


}

