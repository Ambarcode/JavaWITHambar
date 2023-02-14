package com.ak;

public class NoOfSetBits {
    public static void main(String[] args) {
        // 1st Approach:

        int n=9;
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        System.out.println(count);

        //2nd Approach
        System.out.println(setBits(197));
    }

    private static int setBits(int n) {
        int count=0;
        while(n>0){
            count++;
            n=(n&(n-1)); //everytime found the nth rightmost bit
        }
        return count;
    }
}
