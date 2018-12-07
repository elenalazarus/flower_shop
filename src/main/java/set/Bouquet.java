package set;

import base.Color;
import flower.Chamomile;
import flower.Flower;
import flower.Rose;
import flower.Tulip;
import java.util.LinkedList;
import java.util.List;

public class Bouquet extends FlowerList {
    public Bouquet() {
    }

    public Bouquet(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Bouquet getRandomBouquet() {
        int count = (random.nextInt(2) + 1) * 10 + 1;
        List<Flower> flowers = new LinkedList();

        for(int i = 0; i < count; ++i) {
            int flowerType = random.nextInt(3);
            Color color = Flower.getRandomColor();
            int length = Flower.getRandomLength();
            float price = Flower.getRandomPrice();
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

        return new Bouquet(flowers);
    }

    public float getPrice() {
        float price = 0;
        for (Flower flower: flowers){
            price = price + flower.getPrice();
        }
        return price;
    }

    public String toString() {
        return "Bouquet{flowers=" + this.flowers + '}';
    }
}
