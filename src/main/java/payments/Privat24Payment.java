package payments;

public class Privat24Payment implements Payment{
    @Override
    public boolean process(double price) {
        return true;
    }
}