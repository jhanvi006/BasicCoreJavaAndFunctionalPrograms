package com.bridgelabz;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Enter x and y coordinates of a point: ");
        int x = Utility.getUserInteger();
        int y = Utility.getUserInteger();
        double distance = Math.sqrt(x*x + y*y);
        System.out.println("Length of line between ("+x+", "+y+") and (0, 0) is: "+String.format("%.3f", distance));
    }
}
