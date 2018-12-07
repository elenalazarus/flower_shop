import default_bouquet.BouquetRose;
import default_bouquet.BouquetChamomile;
import default_bouquet.BouquetTulip;
import default_bouquet.RCT;
import storage.Storage;
import flower.Chamomile;
import flower.Rose;
import flower.Tulip;
import set.Basket;
import set.Bouquet;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello! You have entered Flower Shop 'Oles & Viktor Production'.");
        System.out.println("Choose any option if you want to make an order: ");
        Scanner reader = new Scanner(System.in);

        Bouquet bouquet = new Bouquet();

        System.out.println(" 1. Order default bouquet \n 2. Make my own bouquet");
        int type = reader.nextInt();
        if (type == 1){
            System.out.println("You can choose such bouquets: ");
            System.out.println(" 1. Hundred roses \n 2. Hundred chamomiles \n 3. Hundred tulips \n 4. Hundred flowers from roses, tulips and chamomiles");
            int tbouquet = reader.nextInt();
            if (tbouquet == 1){
                Bouquet br = BouquetRose.HundredRoses();
                System.out.println("You have ordered hundred roses!");
            }
            else if (tbouquet == 2){
                Bouquet bc = BouquetChamomile.HundredChamomiles();
                System.out.println("You have ordered hundred chamomiles!");
            }
            else if (tbouquet == 3){
                Bouquet bt = BouquetTulip.HundredTulips();
                System.out.println("You have ordered hundred tulips!");
            }
            else if (tbouquet == 4){
                RCT brct = RCT.HundredRCT();
                System.out.println("You have ordered 34 roses, 33 chamomiles and 33 tulips!");
            }
        }
        else if (type == 2){
            System.out.println("How much roses do you want to add?");
            int nroses = reader.nextInt();
            for (int i = 0; i < nroses; i ++){
                bouquet.addFlower(Rose.getRandomRose());
            }
            System.out.println("How much chamomiles do you want to add?");
            int nchamomiles = reader.nextInt();
            for (int i = 0; i < nchamomiles; i ++){
                bouquet.addFlower(Chamomile.getRandomChamolile());
            }
            System.out.println("How much tulips do you want to add?");
            int ntulips = reader.nextInt();
            for (int i = 0; i < ntulips; i ++){
                bouquet.addFlower(Tulip.getRandomTulip());
            }
            System.out.printf("You have ordered bouquet with %d roses, %d chamomiles and %d tulips! \n \n", nroses, nchamomiles, ntulips);

        }
        System.out.print("Price for your order is: $" + (int) bouquet.getOveralPrice() + "\n");


//        Rose rose = Rose.getRandomRose();
//        System.out.println(rose);
//        Chamomile chamomile = Chamomile.getRandomChamolite();
//        System.out.println(chamomile);
//        Tulip tulip = Tulip.getRandomTulip();
//        System.out.println(tulip);
//        Basket basket = Basket.getRandomBasket();
//        System.out.println(basket);
//        Bouquet bouquet = Bouquet.getRandomBouquet();
//        System.out.println(bouquet);
//        Storage storage = new Storage();
//        storage.addRandomData();
//        System.out.println(storage);
    }
}
