package com.ak.level1;

public class DigitSum {
    public static void main(String[] args) {
        //time complexity =no. of Digits=O(logN)
        System.out.println(sum(3453));
    }
    public static int sum(int n){
        if(n<=0) return 0;
        return (n%10)+sum(n/10);
    }
}
