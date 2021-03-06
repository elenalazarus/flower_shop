
package default_bouquet;

import base.Color;
import flower.Flower;
import flower.Tulip;
import set.Bouquet;
import set.FlowerList;
import java.util.LinkedList;
import java.util.List;

public class BouquetTulip extends FlowerList {
    public BouquetTulip() {
    }

    public BouquetTulip(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Bouquet HundredTulips() {
        List<Flower> flowers = new LinkedList();
        Color color = Flower.getRandomColor();
        int length = Flower.getRandomLength();
        float price = Flower.getRandomPrice();

        for(int i = 0; i < 100; ++i) {
            flowers.add(new Tulip(color, price, length));
        }

        return new Bouquet(flowers);
    }
}
