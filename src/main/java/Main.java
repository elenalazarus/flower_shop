import storage.Storage;
import flower.Chamomile;
import flower.Rose;
import flower.Tulip;
import set.Basket;
import set.Bouquet;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello! You have entered Flower Shop 'Oles & Viktor Production'.");
        System.out.println("Choose any option if you want to make an order: ");
        int type = Integer.parseInt(System.console().readLine());
        System.out.println("1. Order default bouquet \n 2. Make my own bouquet");
        if (type == 1){
            System.out.println("You can choose such bouquets: ");
            System.out.println("1. Hundred roses \n 2. Hundred chamomiles \n 3. Hundred tulips \n 4. Hundred flowers from roses, tulips and chamomiles");
            int bouquet = Integer.parseInt(System.console().readLine());
        }
        if (type == 2){
            System.out.println("How much roses do you want to add?");
            int nroses = Integer.parseInt(System.console().readLine());
            System.out.println("How much chamomiles do you want to add?");
            int nchamomiles = Integer.parseInt(System.console().readLine());
            System.out.println("How much tulips do you want to add?");
            int ntulips = Integer.parseInt(System.console().readLine());
        }


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
