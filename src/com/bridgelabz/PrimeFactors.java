package com.bridgelabz;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("Enter a number to get it's prime factors: ");
        int num = Utility.getUserInteger();

        System.out.println("Prime factors of "+num+" are ");
        while (num%2==0){
            System.out.print("2 ");
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            while (num%i==0){
                System.out.print(i+ " ");
                num /= i;
            }
        }
        if (num>2)
            System.out.print(num);
    }
}
