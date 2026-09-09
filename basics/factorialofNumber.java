

public class factorialofNumber {
    public static void main(String[] args) {
        int number = 5; // Number to calculate factorial
        long factorial = 1; // Variable to store factorial result

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by current number
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
    
}
