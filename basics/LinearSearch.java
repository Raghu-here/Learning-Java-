

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter the size of array: ");
        int x = sc.nextInt();

        int[] numbers = new int[x];

        // Taking array elements from user
        System.out.println("Enter " + x + " elements:");

        for (int i = 0; i < x; i++) {
            numbers[i] = sc.nextInt();
        }

        // Taking the number to search
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        // Linear Search
        int size = numbers.length;
        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (numbers[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
