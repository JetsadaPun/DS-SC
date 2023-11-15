package SoftwareCon4;

public class ChristmasDiscounter implements Discounter {
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }
}
