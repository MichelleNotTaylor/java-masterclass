package com.parchment;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMinlongValue);
        System.out.println("long Maximum Value = " + myMaxlongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte)(myMinByteValue/2);
        short myNewShortValue = (short)(myMinShortValue/2);

        byte myByte = 120;
        short myShort = 2334;
        int myInt = 250;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println("Result: " + myLong);
    }
}