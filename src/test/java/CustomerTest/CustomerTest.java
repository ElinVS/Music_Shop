package CustomerTest;

import Accessories.Bow;
import Customer.Customer;
import Instruments.Cello;
import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;
import MusicShop.ShopItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Cello cello;
    Bow bow;


    @Before
    public void before(){
        cello = new Cello("cello", 85.50,70, InstrumentType.STRING, MaterialType.WOOD,"cecilio","dhum-dhum", false );
        bow = new Bow("bow", 20,16.50);
        customer = new Customer("Maverick", 200);
    }

    @Test
    public void hasAName(){
        assertEquals("Maverick", customer.getName());
    }

    @Test
    public void hasAWallet(){
        assertEquals(200, customer.getWallet());
    }

    @Test
    public void startsWithAnEmptyShoppingBag(){
        assertEquals(0, customer.getShoppingBag());
    }

    @Test
    public void canAddItemToShoppingBag(){
        customer.addItem(bow);
        assertEquals(0, customer.getShoppingBag());
    }

    @Test
    public void canBuyAnItemFromShop(){
        customer.buyItem(cello);
        customer.buyItem(bow);
        assertEquals(2, customer.getShoppingBag());
        assertEquals(94.00, customer.getWallet(),0.01);
    }
}
