package com.ak;

import java.util.Scanner;

public class Loop4 {
    //Ques:- Write a java program to check whether a number is prime or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int input = sc.nextInt();
        approach1(input);
        approach2(input);

    }

    private static void approach2(int input) {

        boolean isPrime=true;
        for (int i = 2; i <= input/2; i++)
            if (input%i==0) {
               // System.out.println("Not Prime");
               isPrime=false;

                break;

            }
            System.out.print(isPrime?"Prime":"NOT Prime");



        System.out.println(isPrime);

    }

    static void approach1(int input){
        if (input != 1) {


            int sum = 1;


            for (int i = 2; i <= input / 2; i++) {
                if (input % i == 0) {
                    sum += i;
                }

            }

            System.out.println(sum == 1 ? "prime" : "not prime");

        }
        else
            System.out.println(" Not Prime");

    }
}
