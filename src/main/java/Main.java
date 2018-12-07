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
        Rose rose = Rose.getRandomRose();
        System.out.println(rose);
        Chamomile chamomile = Chamomile.getRandomChamolite();
        System.out.println(chamomile);
        Tulip tulip = Tulip.getRandomTulip();
        System.out.println(tulip);
        Basket basket = Basket.getRandomBasket();
        System.out.println(basket);
        Bouquet bouquet = Bouquet.getRandomBouquet();
        System.out.println(bouquet);
        Storage storage = new Storage();
        storage.addRandomData();
        System.out.println(storage);
    }
}
