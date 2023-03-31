package com.ak.level1;

public class IsPallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome(2454));
    }
    static Boolean isPallindrome(int num){
        return (num==rev(num));
    }
    static int  rev(int num){
        //sometimes you need additional arguments in the function parameter , in that case we'll use a helper function
        int digits=(int)(Math.log10(num))+1;
        return helper(num,digits);
    }
    static int helper(int n, int digit){
        //first checks if "n" has only one digit. If it does, then "n" is already reversed and the function returns "n" as is.
        if(n%10==n) return n;
        int rem=n%10;
        return rem*(int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
    }
}
