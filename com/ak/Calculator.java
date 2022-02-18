package com.ak;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.println();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println(" 1. +\n 2. -\n 3. *\n 4. /\n 5. % \n");
            System.out.print("Enter Num1-->");
            double num1 = input.nextInt();
            System.out.print("\nEnter Num2->");
            double num2 = input.nextInt();
            System.out.print("\nChoose the Operation->");
            char op = input.next().charAt(0);
            switch (op) {
                case '+', '1' -> {
                    double sum = num1 + num2;
                    System.out.println("Output--> " + sum);
                }
                case '-', '2' -> {
                    Double diff = num1 - num2;
                    System.out.println("Output-->" + diff);
                }
                case '*', '3' -> {
                    Double mul = num1 * num2;
                    System.out.println("Output-->" + mul);
                }
                case '/', '4' -> {
                    Double div = num1 / num2;
                    System.out.println("Output-->" + div);
                }
                case '%', '5' -> {
                    double modulo = num1 % num2;
                    System.out.println("Output-->" + modulo);
                }

            }

        }
    }
}
