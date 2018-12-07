package flower;

import base.Color;

public class Rose extends Flower {
    public Rose(Color color, float price, int length) {
        super(color, price, length);
    }

    public static Rose getRandomRose() {
        return new Rose(getRandomColor(), getRandomPrice(), getRandomLength());
    }

    public String toString() {
        return "Rose{color=" + this.color + ", price=" + this.price + ", length=" + this.length + '}';
    }
}
