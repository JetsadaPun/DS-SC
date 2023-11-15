package SoftwareCon4;

public class EasterDiscounter implements Discounter {
    public double applyDiscount(double amount) {
        return amount * 0.5;
    }
}
