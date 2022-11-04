package com.michelle;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

	    int number = 4;
	    int finishNumber = 20;
	    int totalEvenNumbers = 0;

	    while(number <= finishNumber) {
	        number++;
	        if(!isEvenNumber(number)) {
	            continue;
            }
	        totalEvenNumbers++;
            System.out.println("Even number " + number);
            if(totalEvenNumbers == 5) {
                System.out.println("Total number of even numbers found: " + totalEvenNumbers);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
}
