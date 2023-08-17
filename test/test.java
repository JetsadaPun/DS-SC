package test;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        Stack<Character> X = new Stack<>();
        String all = "()[]{}||";

        for (int i = 0; i < S.length(); i++) {
            int p1 = all.indexOf(S.charAt(i));
            if (p1 % 2 == 0) {
                X.push(S.charAt(i));
            } else {
                if (X.isEmpty()) {
                    System.out.println("Incorrect");
                    break;
                } else {
                    int p2 = all.indexOf(X.peek());
                    if (p2 + 1 == p1) {
                        X.pop();
                    } else {
                        System.out.println("Incorrect");
                        break;
                    }
                }
            }
            if (i == S.length() - 1) {
                if (X.isEmpty())
                    System.out.println("Correct.");
                else
                    System.out.println("Incorrect.");
            }
        }
        input.close();
    }
}
