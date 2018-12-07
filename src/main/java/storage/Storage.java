package storage;

import set.Basket;
import set.Bouquet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Storage {
    List<Basket> baskets = new LinkedList();
    List<Bouquet> bouquets = new LinkedList();

    public Storage() {
    }

    public void addRandomData() {
        Random random = new Random();
        int basketsCount = random.nextInt(4) + 1;
        int bouquetsCount = random.nextInt(3) + 2;

        int i;
        for(i = 0; i < basketsCount; ++i) {
            this.baskets.add(Basket.getRandomBasket());
        }

        for(i = 0; i < bouquetsCount; ++i) {
            this.bouquets.add(Bouquet.getRandomBouquet());
        }

    }

    public String toString() {
        return "storage.Storage{baskets=" + this.baskets + ", bouquets=" + this.bouquets + '}';
    }
}
