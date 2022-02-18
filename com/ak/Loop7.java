package com.ak;

import java.util.Scanner;

public class Loop7 {
    //Ques: Write a program that displays the String with space after each character we had inputted
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        insertSpaces(str);
    }

    private static void insertSpaces(String str) {
        int N=str.length();
        StringBuilder newStr= new StringBuilder();
        char ch;
        for (int i = 0; i < N; i++) {

            ch=str.charAt(i);
            newStr.append(ch).append(" ");
            // Or we can also write:
            /*
            * for(int i=0;i<str.length()-1;i++){
            *
            *  System.out.print(str.charAt(i)+" ");
            *
            * }
            *
            * */

        }
        System.out.println(newStr);

    }


}
