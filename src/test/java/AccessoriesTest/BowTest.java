package AccessoriesTest;

import Accessories.Bow;
import Accessories.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest {

    Bow bow;

    @Before
    public void before(){
        bow = new Bow("bow", 28.80,15.20);
    }

    @Test
    public void hasADescription(){
        assertEquals("bow", bow.getItemDescription());
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(28.80, bow.getSellingPrice(),0.01);
    }

    @Test
    public void hasABuyingPrice(){
        assertEquals(15.20, bow.getBuyingPrice() ,0.01);
    }

    @Test
    public void shopItemsMarkUpPrice(){
        assertEquals(13.60, bow.calculateMarkUp(),0.01);
    }
}
