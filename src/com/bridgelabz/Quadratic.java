package com.bridgelabz;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Enter values of a, b and c to find roots of  a*x*x + b*x + c: ");
        int a = Utility.getUserInteger();
        int b = Utility.getUserInteger();
        int c = Utility.getUserInteger();

        int delta = (b*b)-(4*a*c);
        double root1 = (-b + Math.sqrt(delta))/(2*a);
        double root2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("Root 1 of x: "+root1);
        System.out.println("Root 2 of x: "+root2);
    }
}
