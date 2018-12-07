package flower;

import base.Color;

public class Chamomile extends Flower {
    public Chamomile(Color color, float price, int length) {
        super(color, price, length);
    }

    public static Chamomile getRandomChamolite() {
        return new Chamomile(getRandomColor(), getRandomPrice(), getRandomLength());
    }

    public String toString() {
        return "Chamomile{color=" + this.color + ", price=" + this.price + ", length=" + this.length + '}';
    }
}
