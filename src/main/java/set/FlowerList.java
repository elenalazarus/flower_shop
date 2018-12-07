package set;

import flower.Flower;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public abstract class FlowerList {
    protected List<Flower> flowers = new LinkedList();
    protected static Random random = new Random();

    public FlowerList() {
    }

    public FlowerList(List<Flower> initialFlowers) {
        this.flowers.addAll(initialFlowers);
    }

    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }

    protected List<Flower> getFlowers() {
        return this.flowers;
    }

    protected int getCount() {
        return this.flowers.size();
    }

    public float getOveralPrice() {
        float sum = 0.0F;

        Flower flower;
        for(Iterator var2 = this.flowers.iterator(); var2.hasNext(); sum += flower.getPrice()) {
            flower = (Flower)var2.next();
        }

        return sum;
    }
}
