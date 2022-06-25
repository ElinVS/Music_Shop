package AccessoriesTest;

import Accessories.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {


    MusicSheet musicSheet;

    @Before
    public void before(){
        musicSheet = new MusicSheet("music sheet", 10,5, "Requiem for Java");
    }

    @Test
    public void hasADescription(){
        assertEquals("music sheet", musicSheet.getItemDescription());
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(10, musicSheet.getSellingPrice(),0.01);
    }

    @Test
    public void hasABuyingPrice(){
        assertEquals(5, musicSheet.getBuyingPrice() ,0.01);
    }

    @Test
    public void hasAScoreTitle(){
        assertEquals("Requiem for Java", musicSheet.getScoreTitle());
    }

    @Test
    public void shopItemsMarkUpPrice(){
        assertEquals(5, musicSheet.calculateMarkUp(),0.01);
    }


}
