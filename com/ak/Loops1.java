package com.ak;

public class Loops1 {
    // Ques: Write a program which prints the even numbers between 1 and 100 in an increasing and Decreasing Order
    public static void main(String[] args) {
        //EvenIncreasing();
        EvenDecreasing();
    }

     static void EvenDecreasing() {
//         for (int i = 100; i >=1; i--) {
//             if(i%2==0){
//
//                 System.out.println(i+" ");
//             }
//
//         }
         // Or we can also use update the value by i by 2
         for (int i = 100; i >=1 ; i-=2) {
             System.out.println(i+" ");

         }
         // For Odd Numbers
         for (int i = 99; i <0 ; i-=2) {
             System.out.println(i+" ");

         }
         // Using While Loop

         int n=2;
         while (n<=100){
             System.out.println(n+ " ");
             n+=2;

         }
    }

    static void EvenIncreasing() {
         for (int i = 1; i <=100; i++) {
             if(i%2!=0){

                 System.out.println(i+" ");
             }

         }
    }
}
