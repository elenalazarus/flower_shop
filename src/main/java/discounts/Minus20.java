package discounts;

import set.Bouquet;

public class Minus20 extends Discount {
    public Minus20(Bouquet bouquet) {
        super(bouquet);
    }
    @Override
    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}