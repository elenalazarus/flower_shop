

package default_bouquet;

import base.Color;
import flower.Chamomile;
import flower.Flower;
import flower.Rose;
import flower.Tulip;
import set.Bouquet;
import set.FlowerList;
import java.util.LinkedList;
import java.util.List;

public class RCT extends FlowerList {
    public RCT() {
    }

    public RCT(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Bouquet HundredRCT() {
        List<Flower> flowers = new LinkedList();
        Color color = Flower.getRandomColor();
        int length = Flower.getRandomLength();
        float price = Flower.getRandomPrice();

        for(int i = 0; i < 33; ++i) {
            flowers.add(new Tulip(color, price, length));
            flowers.add(new Chamomile(color, price, length));
            flowers.add(new Rose(color, price, length));
        }
        flowers.add(new Rose(color, price, length));

        return new Bouquet(flowers);
    }
}
