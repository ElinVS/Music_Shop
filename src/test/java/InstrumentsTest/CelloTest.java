package InstrumentsTest;

import Instruments.Cello;
import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CelloTest {

    Cello cello;

    @Before
    public void before(){
        cello = new Cello("cello", 85.50,70, InstrumentType.STRING, MaterialType.WOOD,"cecilio","dhum-dhum", true );

    }

    @Test
    public void hasADescription(){
        assertEquals("cello", cello.getItemDescription());
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(85.50, cello.getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeSellingPrice(){
        cello.setSellingPrice(90.00);
        assertEquals(90.00, cello.getSellingPrice(), 0.01);
    }

    @Test
    public void hasABuyingPrice(){
        assertEquals(70, cello.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasAInstrumentType(){
        assertEquals(InstrumentType.STRING, cello.getInstrumentType());
    }

    @Test
    public void hasAMaterialType(){
        assertEquals(MaterialType.WOOD, cello.getMaterialType());
    }

    @Test
    public void hasABrand(){
        assertEquals("cecilio", cello.getBrand());
    }

    @Test
    public void hasASound(){
        assertEquals("dhum-dhum", cello.getSound());
    }

    @Test
    public void comesWithABowTRUE(){
        assertTrue(cello.isSoldWithBow());
    }

    @Test
    public void comesWithABowFALSE(){
        cello = new Cello("cello", 85.50,70, InstrumentType.STRING, MaterialType.WOOD,"cecilio","dhum-dhum", false );
        assertFalse(cello.isSoldWithBow());
    }

    @Test
    public void shopItemsMarkUpPrice(){
        assertEquals(15.50, cello.calculateMarkUp(),0.01);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("The cello sounds like this: dhum-dhum", cello.playInstrument());
    }
}
