package com.michelle;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Michelle", 13);
        System.out.println("New score is " + newScore);
	    calculateScore(75);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println("6 feet 0 inches = " + centimeters + " centimeters.");
        if(centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if(feet >= 0 && inches >= 0 && inches <= 12) {
            int totalInches = (feet * 12) + inches;
            return totalInches * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches >= 0) {
            int leftoverInches = inches % 12;
            int feet = (inches - leftoverInches) / 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + leftoverInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet, leftoverInches);
        } else {
            return -1;
        }
    }
}
