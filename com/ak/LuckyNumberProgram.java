package com.ak;

import java.util.Scanner;

public class LuckyNumberProgram {
    public static void main(String[] args) {
        luckyCheck();
        //luckyCheck2();


    }

    public static void luckyCheck2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number -> ");
        int num = sc.nextInt();

        if (num > 999 && num < 9999) {
                int num1 = num % 10, num2 = (num / 10) % 10, num3 = (num / 100) % 10, num4 = (num / 1000) % 10;
                int rhs = num1 + num2;
                int lhs = num3 + num4;
                if (lhs == rhs) {
                    System.out.println("LUCKY!!!!!!!!!!!");

                } else
                    System.out.println("Better Luck NexT time");

            } else {
                System.out.println("Enter Only a 4 digit Number");
            }
    }

    public static void luckyCheck() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number -> ");
        String s=sc.next();
        //int num= sc.nextInt();
        char c1=s.charAt(0);
        char c2=s.charAt(1);
        char c3=s.charAt(2);
        char c4=s.charAt(3);

        int n1=Character.getNumericValue(c1);
        int n2=Character.getNumericValue(c2);
        int n3=Character.getNumericValue(c3);
        int n4=Character.getNumericValue(c4);

        if(n1+n2==n3+n4){
            System.out.println("Lucky!!");
        }
        else if (n1+n2!=n3+n4){
            System.out.println("Not Lucky");
        }
    }
}
