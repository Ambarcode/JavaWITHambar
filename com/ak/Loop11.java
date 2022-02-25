package com.ak;

import java.util.Scanner;

public class Loop11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println();
        pattern(n);
    }

    private static void pattern(int n) {
        for (int row = 1; row <=n; row++) { // we can also define row in other for loop due to its local scope
            for (int spaces= 1; spaces<= n-row; spaces++) {
                System.out.print(" ");
                
            }
            for (int col = 1; col <=2*row-1 ; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
