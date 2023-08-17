package krit2;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        Stack<Character> X = new Stack<>();
        Stack<Character> y = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(' || S.charAt(i) == '[') {
                if (S.charAt(i) == '(') {
                    X.push((S.charAt(i)));
                } else
                    y.push((S.charAt(i)));
            }
            if (S.charAt(i) == ')') {
                if (X.isEmpty()) {
                    System.out.println("Incorrect.");
                    break;
                } else
                    X.pop();
            }

            if (S.charAt(i) == ']') {
                if (y.isEmpty()) {
                    System.out.println("Incorrect.");
                    break;
                } else
                    y.pop();
            }
            if (i == S.length() - 1) {
                if (X.isEmpty() && y.isEmpty())
                    System.out.println("Correct.");
                else
                    System.out.println("Incorrect.");
            }
        }
        input.close();
    }
}
