package com.ak;

import java.util.Scanner;

public class Loop8 {
    //Ques: Write a Program that reverse the inputted string
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        revString(str);

    }

    private static void revString(String str) {
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i)+"");


        }
    }
}
