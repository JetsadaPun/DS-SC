package SoftwareCon5;

public class Operation {
    public static void main(String[] args) {
        AddCal a = new AddCal();
        System.out.println("The result is " + a.calculate(5.0, 5.0));
        multiply b = new multiply();
        System.out.println("The result is " + b.calculate(5.0, 5.0));
    }
}
