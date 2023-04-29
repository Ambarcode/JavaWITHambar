package com.ak.sortingUsingRecursion;

import java.util.Arrays;

public class InsertionSort {
//
//    Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time.
//
//    The algorithm works by iteratively inserting each unsorted element into its proper position within the sorted subarray.
//
//    Insertion sort maintains two subarrays: the sorted subarray at the beginning and the unsorted subarray at the end.
//
//    The algorithm iterates through the unsorted subarray, taking each element and comparing it with the elements in the sorted subarray until it finds the correct position to insert the element.
//
//    The insertion is done by shifting all the larger elements to the right to make room for the new element.
//
//    The process is repeated until the entire array is sorted.
//
//    Insertion sort has a worst-case and average complexity of O(n^2), where n is the number of items being sorted. This makes it inefficient for large lists, but it can be more efficient than other quadratic algorithms for small lists.
//
//    Insertion sort is a stable sorting algorithm, which means it maintains the relative order of equal elements in the sorted output as they appeared in the original input.
//
//    Use cases for insertion sort include situations where:
//
//    The data set is relatively small or already partially sorted.
//    The data set is nearly sorted or mostly sorted with only a few elements out of place.
//    Stability of the sorting algorithm is important.
//    The data set is stored in a linked list or other data structure that makes random access inefficient or impossible.
//    Overall, insertion sort is a simple and reliable sorting algorithm that is particularly useful for small or partially sorted data sets, and situations where stability is important. It can also be used in situations where the data is stored in a data structure that makes random access inefficient or impossible, since insertion sort only requires sequential access to the data.
public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
   // insertionSortIterative(arr);
    insertionSortRecursive(arr,arr.length);
    System.out.println(Arrays.toString(arr));
}
static void insertionSortIterative(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            else break;
        }
    }
}

    static void insertionSortRecursive(int[] arr, int n){
        if (n <= 1) {
            return;
        }
        insertionSortRecursive(arr, n-1);
        int last = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    static void insertionSortRecursive2(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        insertionSortRecursive(arr, n-1);
        int last = arr[n-1];
        int j;
        for (j = n-2; j >= 0; j--) {
            if (arr[j] > last) {
                arr[j+1] = arr[j];
                arr[j] = last;
            } else {
                break;
            }
        }
    }
}



