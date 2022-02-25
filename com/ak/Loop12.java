package com.ak;

import java.util.Scanner;

public class Loop12 {
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n=sc.nextInt();
            System.out.println();
            pattern(n);
    }


    private static void pattern(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int space = 1; space <=n-i ; space++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=2*i-1 ; j++) {
                if (j==1||j==2*i-1||i==n){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");



            }
            System.out.println();
            
        }
        
    }
    }
