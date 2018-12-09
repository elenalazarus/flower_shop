package discounts;

import flower.Order;
import set.Bouquet;

public class Discount {
    private Bouquet bouquet;

    public Discount(Bouquet bouquet) { this.bouquet = bouquet;}


    public double getPrice() {

        return bouquet.getPrice();
    }
}

