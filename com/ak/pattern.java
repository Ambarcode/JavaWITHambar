package com.ak;

import java.util.Scanner;

class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n =sc.nextInt();
        int n=4;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern28(n);
        //pattern30(n);
         //pattern17(n);
         pattern31(n);

    }

    private static void pattern31(int n) {
        int originalN=n+1;
        n=2*n;

        for (int row = 1; row <=n-1 ; row++) {
            for (int col = 1; col <=n-1 ; col++) {
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");



            }
            System.out.println();

        }
    }

    private static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noOfSpaces = row >= n ? row - n : n-row;
            int c = row > n ? 2 * n - row : row;
            for (int spaces = 1; spaces <= noOfSpaces; spaces++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();


        }
    }



    private static void pattern30(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int col = 0; col <n-row ; col++) {
                System.out.print("  ");

            }
            for (int col = row; col>=1; col--) {
                System.out.print(col+" ");

            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }



    private static void pattern28(int n) {
        for (int row = 1; row <2*n; row++) {
            int noOfSpaces=row>n?row-n:n-row;
            int noOfStars=row>n?(2*n-row):row;
            for (int col= 1; col <=noOfSpaces ; col++) {
                System.out.print(" ");

            }
            for (int col = 0; col <noOfStars ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    private static void pattern5() {
        int N=5;
        for (int row = 0; row < 2*N; row++) {
//            if (row >= N) {
//                for (int col = 0; col < 2 * N - row - 1; col++) {
//                    System.out.print("*");
//
//                }
//                System.out.println();
//
//            } else {
//                for (int k = 0; k <= row; k++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//
//            }
            // Alternatively we can write:
            int totalNoOfColumn=row>=N?(2*N-row-1):row;
            for (int col = 0; col < totalNoOfColumn; col++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    private static void pattern4(int n) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((j+1));

            }
            System.out.println();

        }
    }

    private static void pattern3(int n) {
        for (int i = 0; i <n; i++) {
//            for (int j = i; j <n ; j++) {
//                System.out.print("*");
//
//            }
            // Alternatively :
            for (int col = 0; col < n-i; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for (int rows = 0; rows < 5; rows++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    private static void pattern2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            // when one row is printed we need to print a new line
            System.out.println();

        }
    }

}

