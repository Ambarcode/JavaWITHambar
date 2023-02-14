package com.ak;

public class SumOfNthRowInPascalTriangle {
    public static void main(String[] args) {
        System.out.println(sumOfRow(0));
    }

    private static long sumOfRow(int n) {
        long sum=0;
        for(int row=0;row<n;row++){
            sum+=(1L <<row);
        }
        sum++;
        return sum;
    }
}
