package main;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
