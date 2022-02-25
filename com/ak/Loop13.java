package com.ak;

import java.util.Scanner;

public class Loop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println();
        //pattern(n);
        //updatePattern(n);
        updatePattern_2(n);
    }

    private static void updatePattern_2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");

                } else
//                    if(j>=2&&j!=n){
//                        System.out.print("*");
//
//                    }
//                       else
//                        System.out.print(" ");
//
//
//
//            }
                    if (j == 1 || j == n)
                        System.out.print(" ");
                    else
                        System.out.print("*");


            }
            System.out.println();

        }
    }

    private static void updatePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}

