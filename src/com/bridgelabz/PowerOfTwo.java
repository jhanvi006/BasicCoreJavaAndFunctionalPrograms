package com.bridgelabz;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter a number from 0 to 30: ");
        int n = Utility.getUserInteger();
        if(n>=0 && n<31){
            for (int i=0; i<=n; i++){
                System.out.println("2^"+i+" = "+(int)Math.pow(2, i));
            }
        }
        else
            System.out.println("Error! Number should be between 0 and 30");
    }
}
