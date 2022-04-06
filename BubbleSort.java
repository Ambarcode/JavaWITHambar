package com.ak;

import java.util.Arrays;

public class BubbleSort {

    //In case of worst time complexity , it will take O(n^2) time(i.e. when the array is sorted in opposite order)and in best case it take O(n) time(i.e. when the array is already sorted)
    //bubble sort is an efficient searching algorithm which compare an element in each step
    public static void main(String[] args) {
        int[] arr={8,7,6,5,4,3,2,1};
        //As the input grows , time also grows
        System.out.println("Original Array-->"+Arrays.toString(arr));
        System.out.println("New Array-->"+Arrays.toString(bubbleSort(arr)));
    }



    private static int[] bubbleSort(int[] arr) {
        boolean swapped;
        int n=arr.length;
        //run the steps n-1 times
        for (int i = 0; i <n-1; i++) {
            swapped=false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j <arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            // if you don't swap for a particular value of i , it means that the array is sorted in ascending order
            if (!swapped){
                break;
            }
        }
        return arr;
    }
}
//Note: Best Time Complexity: If for a particular ith value the value of j never swaps , it means the array is sorted
//Hence , you can end the program

//Worst Time Complexity: If we are given a descending order sorted array, we have to sort it in ascending order
//The outer loop will run for (n-1) times and the inner loop will run for (n-i-1) times


//ALso explore about stable sorting algorithm