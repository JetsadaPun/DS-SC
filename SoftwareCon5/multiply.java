package SoftwareCon5;

public class multiply implements ICal {
    private double sum;

    @Override
    public double calculate(double num1, double num2) {
        sum = num1 * num2;
        return sum;
    }
}
