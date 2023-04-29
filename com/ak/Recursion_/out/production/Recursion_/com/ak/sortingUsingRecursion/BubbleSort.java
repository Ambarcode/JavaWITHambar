package com.ak.sortingUsingRecursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
//    Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
//
//    Bubble Sort is a stable sorting algorithm
//
//    The algorithm gets its name from the way smaller elements "bubble" to the top of the list while larger elements "sink" to the bottom.
//
//    Bubble sort has a worst-case and average complexity of O(n^2), where n is the number of items being sorted. This makes it inefficient for large lists.
//
//    The algorithm consists of two nested loops. The outer loop runs from 0 to n-1 and the inner loop runs from 0 to n-i-1.
//
//    In each iteration of the inner loop, the adjacent elements are compared and swapped if they are in the wrong order. This process is repeated until the entire list is sorted.
public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    bubble(arr,arr.length-1,0);
    System.out.println(Arrays.toString(arr));
}
    static void bubble(int[] arr, int row , int column){
        if(row==0) return;
        if(row>column){
            if(arr[column]>arr[column+1])
            {
                int temp=arr[column];
                arr[column]=arr[column+1];
                arr[column+1]=temp;
            }
            bubble(arr,row,column+1);
        }
        else{
            bubble(arr,row-1,0);
        }

    }

}
