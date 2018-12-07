package default_bouquet;

import base.Color;
import flower.Chamomile;
import flower.Flower;
import set.Bouquet;
import set.FlowerList;
import java.util.LinkedList;
import java.util.List;

public class BouquetChamomile extends FlowerList {
    public BouquetChamomile() {
    }

    public BouquetChamomile(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Bouquet HundredChamomiles() {
        List<Flower> flowers = new LinkedList();
        Color color = Flower.getRandomColor();
        int length = Flower.getRandomLength();
        float price = Flower.getRandomPrice();

        for(int i = 0; i < 100; ++i) {
            flowers.add(new Chamomile(color, price, length));
        }

        return new Bouquet(flowers);
    }
}
