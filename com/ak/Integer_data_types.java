package com.ak;

public class Integer_data_types {
    public static void main(String[] args) {
        byte b1=2;
        short s2=123;
        int i1=2147483647;
        int i2=i1+1; // HERE OVERFLOW OCCURS AND A CYCLE FORMATION INITIALIZATION TAKES PLACE
        System.out.println(i2);
        long l1=222222222222222222L;

        //System.out.println(l1+i1+s2+b1);
        System.out.println((Short.MAX_VALUE+Short.MAX_VALUE));
//        findRange();
    }

//    public static void findRange() {
//        //HERE WE ARE USING AN INTEGER CLASS
//       // System.out.println(Integer.MIN_VALUE);
//        // Similarly, we  also have other classes such as Short etc.
//        System.out.println(Short.MIN_VALUE+Short.MAX_VALUE);//OVERFLOW
//    }
}
