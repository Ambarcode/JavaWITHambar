package com.ak;

import java.util.Scanner;

public class Loop6 {
    //Ques: write a program the reads an integer n and displays the nth Fibonacci number

    static int v1=0,v2=1,v3=0;
    public static void main(String[] args) {
           fibonacciSeries_1();
        // fibonacciSeries_2();
       //  int count=10;
        // System.out.print(v1+" "+v2);//printing 0 and 1
         //fibonacciSeries_3(count-2);//n-2 because 2 numbers are already printed
        // recursive approach


        fibonacciSeries_4(); // Using while loop
        fibonacciSeries_5();


    }

    private static void fibonacciSeries_5() {
        System.out.print("Enter the value of N :");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(fib(i) + " ");

        }
    }

    private static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1)
                + fib(n - 2);

    }

    private static void fibonacciSeries_4() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int num =sc.nextInt();
        int num_1=0,num_2=1;
        int counter=0;
        while (counter<num){
            System.out.print(" "+num_1);
            int num3=num_1+num_2;
            num_1=num_2;
            num_2=num3;


            counter+=1;
        }

    }

    private static void fibonacciSeries_3(int count) {
        if (count > 0) {
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
            System.out.print(" " + v3);
            fibonacciSeries_3(count - 1);

        }
    }

    private static void fibonacciSeries_2() {

                int n1=0,n2=1,n3,i,count=10;
                System.out.print(n1+" "+n2);//printing 0 and 1

                for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
                {
                    n3=n1+n2;
                    System.out.print(" "+n3);
                    n1=n2;
                    n2=n3;
                }

            }


    private static void fibonacciSeries_1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if (n != 0) {

            int a = 0, b = 1;
            //System.out.print(a+" "+ b);
            int sum = 0;
            for (int i = 2; i <= n; i++) { // We are starting the index 0
                // To get the nth fibonacci number we need to perform n-2 steps
                sum = a + b;
                a = b;
                b = sum;


            }
             System.out.println("nth Fibonacci number: " + (sum == 0 ? 1 : sum));
        }
        else
            System.out.println("nth Fibonacci number: "+0);
    }
}
