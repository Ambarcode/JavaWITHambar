package com.ak;

import java.util.ArrayList;
import java.util.Arrays;

public class Two_Dimensional_Array {


    // here we will see what a two-dimensional array is

    public static void main(String[] args) {
        int[][] arr = {{3, 2}, {4, 5}};
        //System.out.println(Arrays.toString(arr)); it will print the hash code of the array [[I@e9e54c2, [I@65ab7765]


        int[][] integers = {{3, 5, 7}, {10, 2, 9}};

        //print first row

//        System.out.print(integers[0][0]+" ");
//        System.out.print(integers[0][1]+" ");
//        System.out.print(integers[0][2]+" ");

//        System.out.println();

        //print second row

//        System.out.print(integers[1][0]+" ");
//        System.out.print(integers[1][1]+" ");
//        System.out.print(integers[1][2]+" ");


        // now we are using two nested loop which will print the 2D array in one go

//        for (int i = 0; i <integers.length ; i++) {
//            for (int j = 0; j < integers[i].length; j++) {
//                System.out.print(integers[i][j] + " ");
//
//            }
//            System.out.println();
//        }

        // we can also use an enhanced for loop too

//            for (int[] integer : integers) {
//                for (int i : integer) {
//                    System.out.print(i + " ");
//
//                }


        int[][] integers2 = {
                {3, 5, 7},
                {10, 2, 9}
        };
        // now in this case we are printing an arrayList column by column
        for (int i = 0; i < integers2[0].length; i++) {
            for (int j = 0; j < integers2.length; j++) {
                System.out.print(integers2[j][i] + " ");

            }
            System.out.println();
        }
        // note Arrays.toString Method will provide the hashcode method of all the internal arrays in a 2 Dimensional array
        // hence in order to get the string representation of the internal arrays we will have a method i,e " Arrays.deepToString"  which will provide the string representation of the internal arrau

        System.out.println(Arrays.deepToString(integers2));


        // now we will learn how to pass a 2D array to a function which is similar to passing 1D array to a function
        // And we will also learn how to return an array from a function
        int[][] integers3=getArray();
        printArray(integers3);

    }

    private static void printArray(int[][] integers) {
        System.out.println(Arrays.deepToString(integers));
    }

    private static int[][] getArray() {
        return new int[][]{{1,2,3},{3,4,5}};
    }
}
