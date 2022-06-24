package MusicShopTests;

import Behaviours.ISell;
import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;
import Instruments.Trumpet;
import MusicShop.MusicShop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    ArrayList<ISell> stock;
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Trumpet", InstrumentType.BRASS, MaterialType.BRASS,"Bach", "Trumpety trump", 75, 50,4);
        stock = new ArrayList<>();
        musicShop = new MusicShop(stock);
    }

    @Test
    public void checkStockListCount(){
        assertEquals(0, musicShop.getStockCount());

    }

    @Test
    public void canAddItemsToStock(){
        musicShop.addItem(trumpet);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void canRemoveItemsToStock(){
        musicShop.addItem(trumpet);
        musicShop.addItem();
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void totalPotentialProfitForShop(){

    }


}
