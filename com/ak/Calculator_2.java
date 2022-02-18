package com.ak;

import java.util.Scanner;

public class Calculator_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1 operator num2(for eg. 1 + 2) : ");
        double d1= sc.nextDouble();
        char op=sc.next().charAt(0);
        double d2= sc.nextDouble();
        System.out.println();
        switch (op){
            case '+', '1' -> {
                double sum = d1 + d2;
                System.out.println("Output--> " + sum);
            }
            case '-', '2' -> {
                Double diff = d1 - d2;
                System.out.println("Output-->" + diff);
            }
            case '*', '3' -> {
                Double mul = d1 * d2;
                System.out.println("Output-->" + mul);
            }
            case '/', '4' -> {
                Double div = d1 / d2;
                System.out.println("Output-->" + div);
            }
            default -> System.out.println("Enter a Valid Operator!");
        }

    }
}
