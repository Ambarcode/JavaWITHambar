package com.ak.sortingUsingRecursion;

import java.util.Arrays;

public class SelectionSort {
    //first we'll see the iterative way then we'll see the recursive way
//    Selection sort works by repeatedly finding the maximum element from the unsorted part of the array and swapping it with the last element of the unsorted part.
//
//     selection sort is not a stable sorting algorithm.
//
//    The algorithm maintains two subarrays: the sorted subarray at the end and the unsorted subarray at the beginning.
//
//    In each iteration, the algorithm searches for the maximum element in the unsorted subarray and swaps it with the last element of the unsorted subarray. This effectively moves the maximum element to its correct position in the sorted subarray.
//
//    The process is repeated until the entire array is sorted.
//
//    Selection sort has a worst-case and average complexity of O(n^2), where n is the number of items being sorted. This makes it inefficient for large lists.
//
//    Here's an example implementation of selection sort in Java using the approach of taking the maximum element and swapping it with the last element of the unsorted part:
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        //SelectionIterative(arr);
        SelectionRecursive(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionIterative(int[] arr){

        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int max=0;
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[max])
                    max=j;
            }
            //after traversing for onw ith iteration , now it's time to swap the maximum element with the last index;
            int temp=arr[n-i-1];
            arr[n-i-1]=arr[max];
            arr[max]=temp;

        }
    }

    static void SelectionRecursive(int[] arr, int row , int column , int max){
        if(row==0) return;
        if(row>column){
            if(arr[column]>arr[max]){
                SelectionRecursive(arr,row,column+1,column);
            }
            else {
                SelectionRecursive(arr,row,column+1,max);
            }
        }
        else {
            //now we'll do swapping
            int temp=arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            SelectionRecursive(arr,row-1,0,0);
        }
    }
}
