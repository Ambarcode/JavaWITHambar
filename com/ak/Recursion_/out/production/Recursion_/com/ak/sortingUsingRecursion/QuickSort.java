package com.ak.sortingUsingRecursion;

import java.util.Arrays;

public class QuickSort {
//    QuickSort is a popular comparison-based sorting algorithm that divides the input array into two parts around a pivot element and recursively sorts them. It is a divide-and-conquer algorithm that has an average-case time complexity of O(n log n) and a worst-case time complexity of O(n^2), where n is the number of elements to be sorted. However, in practice, QuickSort is very efficient and often outperforms other sorting algorithms like MergeSort and HeapSort.
//
//    Here are some important points to note about QuickSort:
//
//    QuickSort is an in-place sorting algorithm, which means it does not require any additional memory beyond the input array.
//    QuickSort is not stable, which means that the order of equal elements may not be preserved after sorting.
//    QuickSort works well for large datasets and is often used in practice to sort large collections of data.
//    The performance of QuickSort depends largely on the choice of the pivot element. A bad choice of pivot can result in the worst-case time complexity of O(n^2).
//    There are different strategies for choosing the pivot element, including choosing the first, last, or middle element as the pivot, or using a random element as the pivot.
//    QuickSort has several variants, including Hoare's partition scheme and Lomuto's partition scheme.
//    QuickSort is used in many programming languages, including C++, Java, and Python.
//    In summary, QuickSort is a widely used sorting algorithm that is efficient and works well for large datasets. However, it has some drawbacks, including a worst-case time complexity of O(n^2) and the possibility of not preserving the order of equal elements.
public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    quickSort2(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
}
    static void quickSort(int[] arr , int low , int high){
        if(low>=high) return ;
        int s=low;
        int e=high;
        int pivot=arr[s+(e-s)/2];

        while(s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }

            //now if we reached here , it means that there will be a validation
            if (s <= e) {
                // Swap arr[s] and arr[e]
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                s++;
                e--;
            }
        }
        // Recursive calls to quickSort
        quickSort(arr, low, e);
        quickSort(arr, s, high);
        }
    static void quickSort2(int arr[], int low, int high)
    {
        if(low<high){
            int pdx=partition(arr, low,high);

            quickSort2(arr, low, pdx-1);
            quickSort2(arr, pdx+1, high);
        }
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot=arr[high];
        int i=low-1; //used for swapping
        for(int j=low; j<high;j++){ //we are not traversing till last , as our last element is the pivot only
            if(arr[j]<pivot){
                i++;

                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }

}

