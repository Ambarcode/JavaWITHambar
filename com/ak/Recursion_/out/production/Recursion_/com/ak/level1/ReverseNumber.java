package com.ak.level1;

public class ReverseNumber {
    public static void main(String[] args) {
//        rev(4563);
//        System.out.println(sum);
        System.out.println(rev2(4567));
    }
    //approach 1
    static int sum=0;
    static void rev(int num){
        if(num==0) {
            return;
        }
        int rem=num%10;
        sum=sum*10+rem;
        rev(num/10);
    }

    //approach 2
    static int  rev2(int num){
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
