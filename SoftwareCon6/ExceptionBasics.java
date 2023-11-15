package SoftwareCon6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasics {
    public static void main(String[] agrs) {
        int i = 0;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer :");
            i = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You did not enter integer");
        }
        System.out.printf("You entered %d\n", i);

    }
}
