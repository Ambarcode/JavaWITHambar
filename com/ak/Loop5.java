package com.ak;

import java.util.Scanner;

public class Loop5 {
    // Ques : write a program which reads a sequence of positive integers.
    // The program stops when the user fills  a negative value and shows the maximum and minimum out of these numbers

    public static void main(String[] args) {
//        int n=1234;
//        System.out.println(n%10);
//        System.out.println((n/10)%10);
//        System.out.println((n/100)%10);
//        System.out.println((n/1000)%10);
        //acceptsUntilNegativeInt();
          inputSum();
    }

    private static void inputSum() {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        while (num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("SUM : "+sum);

    }

    private static void acceptsUntilNegativeInt() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int max = input, min = input;
        if (input > 0) {
            while (true) {
                input = sc.nextInt();

                if (input < 0) { //Here we have to put this condition first because if users enters a negative value it will be stored inside min
                    break;
                }
          //    if (input > max)
          //      max = input;

          //      if (input < min)
            //        min = input;


                max= Math.max(input, max);
                min=Math.min(input,min);



            }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        }
        else
            System.out.println(input +" is invalid in start");;

    }

}
