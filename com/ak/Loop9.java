package com.ak;

import java.util.Scanner;

public class Loop9 {
    // Ques: Write a program that check whether a string is palindrome or not
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
       // isPallindrome(str);
        isPallindrome_2(str);
    }

    private static void isPallindrome_2(String str) { // It is the best approach
        Boolean is_Pallindrome=true;
        for (int i = 0 ,j=str.length()-1; i <j ; i++,j--) {
            if (str.charAt(i)==str.charAt(j))
                continue;
            is_Pallindrome=false;
            break;
        }
        System.out.println(is_Pallindrome?"The given String is a Palindrome":"The given String is NOT a Palindrome");
    }

    private static void isPallindrome(String str) {
        String rev="";
        for (int i = str.length()-1; i >=0; i--) {
            rev+=str.charAt(i)+"";

        }
        if(str.compareToIgnoreCase(rev)==0){
            System.out.println("The given String is a Palindrome");
        }
        else
            System.out.println("The given String is NOT a Palindrome");

    }
}
