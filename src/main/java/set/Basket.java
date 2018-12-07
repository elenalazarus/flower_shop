package set;

import base.Color;
import flower.Chamomile;
import flower.Flower;
import flower.Rose;
import flower.Tulip;
import java.util.LinkedList;
import java.util.List;

public class Basket extends FlowerList {
    public Basket() {
    }

    public Basket(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Basket getRandomBasket() {
        int flowerType = random.nextInt(3);
        int count = (random.nextInt(2) + 1) * 10;
        Color color = Flower.getRandomColor();
        int length = Flower.getRandomLength();
        float price = Flower.getRandomPrice();
        List<Flower> flowers = new LinkedList();

        for(int i = 0; i < count; ++i) {
            switch(flowerType) {
                case 0:
                    flowers.add(new Rose(color, price, length));
                    break;
                case 1:
                    flowers.add(new Chamomile(color, price, length));
                    break;
                case 2:
                    flowers.add(new Tulip(color, price, length));
            }
        }

        return new Basket(flowers);
    }

    public String toString() {
        return "Basket{flowers=" + this.flowers + '}';
    }
}
