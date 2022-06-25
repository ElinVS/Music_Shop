import Accessories.Bow;
import Accessories.MusicSheet;
import Behaviours.ISell;
import Customer.Customer;
import Instruments.Cello;
import Instruments.Enums.InstrumentType;
import Instruments.Enums.MaterialType;
import Instruments.Trumpet;
import MusicShop.MusicShop;
import MusicShop.Till;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        MusicShop musicShop;
        ArrayList<ISell> stock;
        Till till;
        Cello cello;
        Trumpet trumpet;
        Bow bow;
        MusicSheet musicSheet;
        Customer customer;

        customer = new Customer("Peter", 200);
        ArrayList<ISell> shoppingBag;

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




        System.out.print("Hello! Welcome to Bobs Music Shop. Would you like to buy an instrument today? Yes or No? ");
        String answer = in.nextLine();
//        System.out.println(answer);
        if(Objects.equals(answer.toLowerCase(), "yes")){
            System.out.println("Great! I currently have a trumpet and a cello in stock. The trumpet costs " +trumpet.getSellingPrice() + " and the cello costs " + cello.getSellingPrice() + " Which one would you like? Trumpet or Cello?");
            String choice = in.nextLine();
//            System.out.println(choice);
            if(Objects.equals(choice.toLowerCase(), "trumpet")){
                customer.buyItem(trumpet);
                System.out.println("Great choice! Enjoy your new instrument. You have " + customer.getShoppingBag() + " item added to your shopping bag");
            }
            if(Objects.equals(choice.toLowerCase(), "cello")){
                customer.buyItem(cello);
                System.out.println("Interesting choice! Enjoy your new instrument. You have " + customer.getShoppingBag() + " item added to your shopping bag");
            }
        } else if(answer.equals("No")){
            in.nextLine();
            System.out.println("Are you looking for an accessory perhaps? I got a bow for " + bow.getSellingPrice() + " and a music sheet " + musicSheet.getSellingPrice() + " which has the score " +musicSheet.getScoreTitle() + " ?");
            String choice = in.nextLine();
//            System.out.println(choice);
            if(Objects.equals(choice.toLowerCase(), "bow")){
                customer.buyItem(trumpet);
                System.out.println("Wonderful. That will be " + bow.getSellingPrice() + " you still have " + customer.getWallet() + " left to shop for");
            }
            if(Objects.equals(choice.toLowerCase(), "cello")){
                customer.buyItem(cello);
                System.out.println("Interesting choice! Enjoy your new instrument. You have " + customer.getShoppingBag() + " item added to your shopping bag");
            }
            if(Objects.equals(choice.toLowerCase(), "music sheet")){
                customer.buyItem(cello);
                System.out.println("Noted! That will be " + musicSheet.getSellingPrice() + " you still have " + customer.getWallet() + " left to shop for");
            }

        }

    }


}
