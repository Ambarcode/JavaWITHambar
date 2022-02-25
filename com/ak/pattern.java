package com.ak;

import java.util.Scanner;

class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n =sc.nextInt();
        int n=5;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern28(n);
        //pattern30(n);
         //pattern17(n);
         //pattern31(n);
        //pattern12(n);
        //pattern13(n);
        //pattern14(n);
        //pattern15(n);
        ///NOW WE ARE GOING TO PRINT A PATTERN USING SINGLE FOR LOOP
        //patternUsingSingleForLoop(n);
    }

    private static void patternUsingSingleForLoop(int n) {
        int currStar=0;
        for (int currLine = 1; currLine <=n;) {
            if (currStar< currLine) {
                System.out.print("*");
                currStar++;
                continue;

            }
            if (currStar==currLine){
                System.out.println("");
                currLine++;
                currStar=0;

            }

        }
    }

    private static void pattern15(int n) {
        for (int row = 1 ;row <=n ; row++) {
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print(" ");
            }
            for (int col = 1; col <=2*row-1; col++) {
                if (col==1|| col==2*row-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();


        }
        for (int row = 2; row <=n ; row++) {
            for (int spaces = 1; spaces <row; spaces++) {

                System.out.print(" ");

            }
            for (int col = 2*row-1; col <=2*n-1 ; col++) {
                if (col==2*row-1||col==2*n-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    private static void pattern14(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int spaces = 1; spaces <row; spaces++) {

                System.out.print(" ");

            }
            for (int col = 2*row-1; col <=2*n-1 ; col++) {
                if (row==1||col==2*row-1||col==2*n-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern13(int n) {
        for (int row = 1 ;row <=n ; row++) {
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print(" ");
            }
            for (int col = 1; col <=2*row-1; col++) {
                if (col==1|| col==2*row-1|| row==n){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern12(int n) {

        for (int row = 1; row <=2*n ; row++) {
            int noOfColumn=row>n?row-n:n-row+1;;
            int noOfSpaces=n-noOfColumn;
            for (int spaces = 1; spaces <= noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=noOfColumn; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
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


