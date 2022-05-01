package com.bridgelabz;

public class EvenOddCheck {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = Utility.getUserInteger();
        if (num%2 == 0)
            System.out.println(num+" is even.");
        else
            System.out.println(num+" is odd.");
    }
}
