package com.ak;

import java.awt.*;
import java.util.Arrays;

public class fillMethod {
     static int[] arr= new int[8];

    public static void main(String[] args) {
       // System.out.println(Arrays.toString(arr));
       // Arrays.fill(arr,5);
       // System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,3,7,5);
       // System.out.println(Arrays.toString(arr));
        Point p=new Point(1,2);
        Point p2=new Point(1,2);
        Point[] point = new Point[3];
        Arrays.fill(point,0,2,new Point(3,4));
        System.out.println(Arrays.toString(point));
    }
}


