package com.bridgelabz;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to find largest amongst them: ");
        int num1 = Utility.getUserInteger();
        int num2 = Utility.getUserInteger();
        int num3 = Utility.getUserInteger();
        int largest = Math.max(Math.max(num1, num2), num3);
        System.out.println("Largest of "+num1+", "+num2+", "+num3+" is "+largest);
    }
}
