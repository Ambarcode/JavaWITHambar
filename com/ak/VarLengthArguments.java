package com.ak;

import java.util.Arrays;

public class VarLengthArguments {
    public static void main(String[] args) {
//        System.out.println(sum(3,4,1,5));
//        System.out.println(sum(-1,1,3,-3));
//        System.out.println(sum(new int[] {1,9,4}));
        System.out.println(sum2("Ambar",3,2,1,4,7,8));

    }
    public static int sum(int ... num){
        int sum=0;
        for (int j : num) {
            sum += j;
        }
        return sum;
    }
    public static String sum2(String s,int ... numb){
        return s +" "+"\n"+ Arrays.toString(numb);
    }
}
