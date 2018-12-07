package payments;

public class CashPayment implements Payment {
    @Override
    public boolean process(double price) {
        return true;
    }
}
