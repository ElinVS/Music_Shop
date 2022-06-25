package InstrumentsTest;

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
        trumpet = new Trumpet("trumpet", 75.50,50,InstrumentType.BRASS,MaterialType.BRASS,"bach","tot-to-tot",4 );

    }

    @Test
    public void hasADescription(){
        assertEquals("trumpet", trumpet.getItemDescription());
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(75.50, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void hasABuyingPrice(){
        assertEquals(50, trumpet.getBuyingPrice(), 0.01);
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
        assertEquals("bach", trumpet.getBrand());
    }

    @Test
    public void hasASound(){
        assertEquals("tot-to-tot", trumpet.getSound());
    }

    @Test
    public void hasANumberOfValves(){
        assertEquals(4, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("The trumpet sounds like this: tot-to-tot", trumpet.playInstrument());
    }

    @Test
    public void shopItemsMarkUpPrice(){
        assertEquals(25.50, trumpet.calculateMarkUp(),0.01);
    }


}
