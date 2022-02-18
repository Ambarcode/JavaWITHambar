package com.ak;

public class Switch {
    public static void main(String[] args) {
        int n = 90;

        // Example 1 --> In this all the case after case 90 will be executed
        // because there is no break after case 90 (even below statements are not correct


        switch (n) {
            case 90:
                System.out.println("90");
            case 30:
                System.out.println("30");
            case -3:
                System.out.println("-3");
            default:
                System.out.println("this is a default statement ");

 /*


 Output
                90
                30
                -3
                this is a default statement

*/
                // Example 2-->
                int n1 = 30;
                switch (n1) {
                    case 90:
                        System.out.println("90");
                    case 30:
                        System.out.println("30");
                    case -3:
                        System.out.println("-3");
                    default:
                        System.out.println("this is a default statement ");
/*
Output

        30
        -3
        this is a default statement

 */
                }

                // Example 3 -->
                int n2 = -3;
                switch (n2) {
                    case 90:
                        System.out.println("90");
                    case 30:
                        System.out.println("30");
                    case -3:
                        System.out.println("-3");
                    default:
                        System.out.println("this is a default statement ");


                }
                        /*
                        Output

                        -3
                        this is a default statement

                         */
        }
        //Example -->4

        int n3 = 60;
        switch (n3) {
            case 60:
                System.out.println("60");
            case 30:
                System.out.println("30");
            case -3:
                System.out.println("-3");
                break;
            default:
                System.out.println("this is a default statement ");

                //Output
                // this is a default statement
        }
        System.out.println();
        System.out.println();
        // Example--> 5

        int n4 = 87;
        switch (n4) {
            case 90:
                System.out.println("90");
            case 30:
                System.out.println("30");
            default:
                System.out.println("this is a default statement ");

            case -3:
                System.out.println("-3");

        }

        /*
        OUTPUT

        this is a default statement
        -3

         */

        // **********Example--> 6

        int n5=0;
        switch (n5){
            case 10:
                System.out.println("10");
            case 20:
                System.out.println("20");
            default:
                System.out.println("this is a default statement");
            case 0:

                System.out.println("0");
        }
               /*
               Output

               0


                */
        // Float are not allowed in switch
        //we can't use logical operators in cases
        //
        // Example of new switch syntax

//        float f=3.3f;
//        int f1=2,f2=3;
//
//        switch (f1&f2){
//
//            case 3>2 &&  4<5:
//        }
    int a=5;
    switch (a){
        case 0 -> System.out.println("Hello");

    }

    }
}


