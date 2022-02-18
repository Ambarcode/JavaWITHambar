package com.ak;

import java.util.Scanner;

class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n =sc.nextInt();
        int n=4;
        pattern1(n);
    }

    private static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            // when one row is printed we need to print a new line
            System.out.println();

        }
    }

}