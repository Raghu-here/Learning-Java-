package basics;
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int number = sc.nextInt();
        
        if (number%2 ==0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        
    }
    
}
