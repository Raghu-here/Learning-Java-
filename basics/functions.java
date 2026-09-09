package basics;

import java.util.Scanner;

public class functions {
    public static int add(int a, int b) {
        return a + b;
    }
public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = add(a, b);
        int difference = subtract(a, b);                    
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The difference of " + a + " and " + b + " is: " + difference);
    }

}
