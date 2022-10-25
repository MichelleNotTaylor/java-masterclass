package com.michelle;

public class Main {

    public static void main(String[] args) {
        printConversion(100);
    }

    private static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }

        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");

    }

    private static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour/1.609);
    }

}
