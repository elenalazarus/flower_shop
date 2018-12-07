
package default_bouquet;

import base.Color;
import flower.Flower;
import flower.Rose;
import set.Bouquet;
import set.FlowerList;
import java.util.LinkedList;
import java.util.List;

public class BouquetRose extends FlowerList {
    public BouquetRose() {
    }

    public BouquetRose(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Bouquet HundredRoses() {
        List<Flower> flowers = new LinkedList();
        Color color = Flower.getRandomColor();
        int length = Flower.getRandomLength();
        float price = Flower.getRandomPrice();

        for(int i = 0; i < 100; ++i) {
            flowers.add(new Rose(color, price, length));
        }

        return new Bouquet(flowers);
    }
}
