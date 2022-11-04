package com.michelle;

public class Main {

    public static void main(String[] args) {
        sumDigits(125);
    }

    public static int sumDigits(int number) {
        if(number >= 10) {
            int sum = 0;
            while(number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            System.out.println("Sum of digits is " + sum);
        }
        return -1;
    }
}
