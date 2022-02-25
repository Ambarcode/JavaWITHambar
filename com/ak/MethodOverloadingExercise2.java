package com.ak;

public class MethodOverloadingExercise2 {
    public static void main(String[] args) {
        Boolean b;
        System.out.println("Prime no. Between 1 And 50 is : ");
        for (int i = 2; i <=50; i++) {
             b=isPrime(i);
            if (b) {
                System.out.print(i+" ");

            }

        }
    }

    private static Boolean isPrime(int n) {
        Boolean is_Prime=true;
        for (int i = 2; i <=n/2 ; i++) {
            if (n%i==0) {
                is_Prime = false;
                return is_Prime;
            }
        }
        return is_Prime;
    }
}
