package com.bridgelabz;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year(yyyy): ");
        int year = Utility.getUserInteger();
        int length = String.valueOf(year).length();
        if (length == 4) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year!");
            } else {
                System.out.println(year + " is not a leap year!");
            }
        }
        else
            System.out.println("Error: Enter year in yyyy format.");
    }
}
