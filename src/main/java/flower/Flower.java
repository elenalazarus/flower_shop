package flower;

import base.Color;
import java.util.Random;

public abstract class Flower {
    protected Color color;
    protected float price;
    protected int length;
    protected static Random random = new Random();

    public Flower(Color color, float price, int length) {
        this.color = color;
        this.price = price;
        this.length = length;
    }

    public Color getColor() {
        return this.color;
    }

    public float getPrice() {
        return this.price;
    }

    public int getLength() {
        return this.length;
    }

    public static Color getRandomColor() {
        switch(random.nextInt(3)) {
            case 0:
                return Color.RED;
            case 1:
                return Color.PINK;
            case 2:
                return Color.YELLOW;
            default:
                return Color.WHITE;
        }
    }

    public static float getRandomPrice() {
        return 3.0F + random.nextFloat() * 10.0F;
    }

    public static int getRandomLength() {
        return (4 + random.nextInt(5)) * 10;
    }
}
