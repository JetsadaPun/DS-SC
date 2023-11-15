package SoftwareCon5;

public class AddCal implements ICal {
    private double sum;

    public double calculate(double num1, double num2) {
        sum = num1 + num2;
        return sum;
    }
}
