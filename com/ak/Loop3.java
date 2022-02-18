package com.ak;

import java.util.Scanner;

// Write a java program that displays the sum of strict divisor

public class Loop3 {

    public static void main(String[] args) {
       strictDivisorUsingForLoop();
       //strictDivisorUsingWhileLoop();


        }

    private static void strictDivisorUsingWhileLoop() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int input =sc.nextInt();
        int sum=1;
        int i=2;
        String str="";
        while (i<input){
            if (input%i==0){
                sum += i;
                str=i+"+";
                System.out.print(str);

            }
            i++;

        }
        System.out.println(" = " + sum);
    }


    private static void strictDivisorUsingForLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int input = sc.nextInt();
        int sum = 0;
        String str="",str_new="";


        // Note : Strict divisors are numbers less than or equal to N/2
        for (int i = 1; i <= input / 2; i++) {
            if (input % i == 0) {
                sum += i;
                str = i + "+";


                System.out.print(str);

            }


        }




        System.out.println(" = " + sum);
    }
}
