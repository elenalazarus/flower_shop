package flower;

import base.Color;

public class Tulip extends Flower {
    public Tulip(Color color, float price, int length) {
        super(color, price, length);
    }

    public static Tulip getRandomTulip() {
        return new Tulip(getRandomColor(), getRandomPrice(), getRandomLength());
    }

    public String toString() {
        return "Tulip{color=" + this.color + ", price=" + this.price + ", length=" + this.length + '}';
    }
}
