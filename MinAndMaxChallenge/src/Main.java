import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean go = true;
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        while(go) {
            try {
                System.out.println("Hello! Please enter a number or any character to quit.");
                int input = scanner.nextInt();
                if(min == 0){
                    min = input;
                }
                if(input > max) {
                    max = input;
                }
                if(input < min) {
                    min = input;
                }
            } catch (Exception e) {
                go = false;
            }
        }
        System.out.println("Maximun number: " + max);
        System.out.println("Minimum number: " + min);
    }
}