package SoftwareCon4;

public class NewYearDiscounter implements Discounter {
    public double applyDiscount(double amount) {
        return amount * 0.95;
    }
}
