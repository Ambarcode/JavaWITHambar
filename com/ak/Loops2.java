package com.ak;

import java.util.Scanner;

public class Loops2 {
    // Ques-> Write a program which reads a sequence of integer from user and stops by displaying "Done"
    // when the sum of these values exceeds by 100
    public static void main(String[] args) {
        System.out.println("Welcome!");
        //exceeds100();
        //exceeds100_2();
        exceeds100_3();

    }

     static void exceeds100_3() {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter a no. :");
            sum+=sc.nextInt();

        }while (sum<=100);
         System.out.println("Done for Now!");
    }

    static void exceeds100_2() {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        while (sum<=100) {
            System.out.print("enter a number : ");
            n = sc.nextInt();
            sum = sum + n;

            }
        System.out.println("Done for Now!!!");
        }


    static void exceeds100() {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("enter a number : ");
            n = sc.nextInt();
            sum = sum + n;
            if (sum > 100) {
                System.out.println("The value had crossed the 100th mark");
                break;

            }
        }
    }
}
