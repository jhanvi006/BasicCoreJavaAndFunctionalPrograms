package com.bridgelabz;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        int num1 = Utility.getUserInteger();
        System.out.println("Enter num2: ");
        int num2 = Utility.getUserInteger();
        System.out.println("Before swap: "+num1+" "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap: "+num1+" "+num2);
    }
}
