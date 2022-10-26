package com.michelle;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 30));
        System.out.println(getDurationString(66));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int leftoverMinutes = minutes % 60;
            int hours = (minutes - leftoverMinutes) / 60;
            return hours + "h " + leftoverMinutes + "m " + seconds + "s";
        } else {
            return "Invalid value.";
        }
    }

    public static String getDurationString(int seconds) {
        if(seconds >= 0) {
            int leftoverSeconds = seconds % 60;
            int minutes = (seconds - leftoverSeconds) / 60;
            return getDurationString(minutes, leftoverSeconds);
        } else {
            return "Invalid value.";
        }
    }
}
