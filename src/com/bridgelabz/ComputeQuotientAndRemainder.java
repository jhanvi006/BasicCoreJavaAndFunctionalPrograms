package com.bridgelabz;

public class ComputeQuotientAndRemainder {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers to find quotient and remainders: ");
        int num1 = Utility.getUserInteger();
        int num2 = Utility.getUserInteger();

        int quotient = num1/num2;
        int remainder = num1%num2;
        System.out.println("Quotient of "+num1+"/"+num2+" is "+quotient);
        System.out.println("Remainder of "+num1+"/"+num2+" is "+remainder);
    }
}
