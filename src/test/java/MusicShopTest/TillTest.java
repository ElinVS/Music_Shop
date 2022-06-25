package MusicShopTest;
import MusicShop.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till(100000);
    }

    @Test
    public void tillHasABalance(){
        assertEquals(100000, till.getBalance(), 0.01);
    }


}
