package com.ak;
// Note : If the class is in the same package there is no need to import it again and again


import java.awt.*;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,8,0,33,8};
        System.out.println(Arrays.binarySearch((arr),8));

        Point[] p={ new Point(3,4),new Point(2,7)};
//        System.out.println(Arrays.binarySearch(); // We can not apply binary search method on Point class as we are internally using compareTo method whose implementaion is not there in point class
    }
}
