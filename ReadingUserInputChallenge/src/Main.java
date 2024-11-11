import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello! Please enter five numbers.");
            for(int i = 0; i < 5; i++) {
                System.out.print("Enter number #" + (i + 1) + ": ");
                sum += scanner.nextInt();
            }
        } catch(InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}