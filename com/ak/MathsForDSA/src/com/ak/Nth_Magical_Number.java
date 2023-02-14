package com.ak;

public class Nth_Magical_Number {
    public static void main(String[] args) {
        // To find nth magical number we'll  convert the number into binary and then multiply each bit with power of 5;
        System.out.println(magicalNumber(34));

    }

    private static int magicalNumber(int n) {
        int ans=0;
        int base=6;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base*=6;

        }
        return ans;
    }
}
