package com.bridgelabz;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("Enter rows and columns for 2D array: ");
        int row = Utility.getUserInteger();
        int column = Utility.getUserInteger();
        int arr[][] = new int[row][column];
        System.out.println("Enter "+row*column+" elements of array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = Utility.getUserInteger();
            }
        }
        System.out.println("The 2D array values are ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
