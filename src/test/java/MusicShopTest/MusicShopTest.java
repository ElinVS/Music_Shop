package MusicShopTest;

import Accessories.Bow;
import Accessories.MusicSheet;
import Behaviours.ISell;
import Customer.Customer;
import Instruments.Cello;
import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;
import Instruments.Trumpet;
import MusicShop.MusicShop;
import org.junit.Before;
import MusicShop.Till;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    ArrayList<ISell> stock;
    Till till;

    Cello cello;
    Trumpet trumpet;
    Bow bow;
    MusicSheet musicSheet;


    @Before
    public void before(){
        till = new Till(50000);

        cello = new Cello("cello", 85.50,70, InstrumentType.STRING, MaterialType.WOOD,"cecilio","dhum-dhum", true );
        trumpet = new Trumpet("trumpet", 75.50,50,InstrumentType.BRASS,MaterialType.BRASS,"bach","tot-to-tot",4 );
        bow = new Bow("bow", 28.80,15.20);
        musicSheet = new MusicSheet("music sheet", 10,5, "Requiem for Java");
        stock = new ArrayList<>();
        stock.add(cello);
        stock.add(trumpet);
        stock.add(bow);
        stock.add(musicSheet);

        musicShop = new MusicShop(stock,till);
    }

    @Test
    public void musicShopHasStock(){
        assertEquals(4, musicShop.getStock());
    }

    @Test
    public void canAddItemToStock(){
        Bow bow1 =  new Bow("bow", 28.80,15.20);
        musicShop.addItem(bow1);
        assertEquals(5, musicShop.getStock());
    }

    @Test
    public void canRemoveItemFromStock(){
        musicShop.removeItem(bow);
        assertEquals(3, musicShop.getStock());
    }

    @Test
    public void hasATill(){
        assertEquals(50000, musicShop.getTill(),0.01);
    }

    @Test
    public void getTotalPotentialProfit(){
        assertEquals(59.60, musicShop.getTotalPotentialProfit(),0.01);
    }

}
