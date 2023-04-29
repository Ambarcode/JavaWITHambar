package com.ak.sortingUsingRecursion;

import java.util.Arrays;

public class MergeSort {
//    Merge Sort is a sorting algorithm that follows the divide-and-conquer approach to sort an array or a list. It works by dividing the input array into two halves recursively until each half consists of only one element, and then merging the two halves by comparing the elements and sorting them in a new array.
//
//    Time Complexity: The time complexity of Merge Sort is O(nlogn), which is efficient for large input sizes. It has a worst-case time complexity of O(nlogn) and a best-case time complexity of O(nlogn), making it a reliable sorting algorithm for most cases.
//
//    Stability: Merge Sort is a stable sorting algorithm. Stable sorting algorithms maintain the relative order of equal elements in the input array. This means that if two elements have the same value, they will maintain their order in the sorted array as they appeared in the original array.
//
//    Use cases: Merge Sort is commonly used in situations where the input size is large, and stable sorting is desired. It is also useful when the input data is in a linked list format as it does not require random access to the data. Some of the use cases for Merge Sort include sorting large databases, sorting linked lists, and implementing parallel algorithms.
//
//    Other important points:
//
//    Merge Sort is a recursive algorithm.
//    It requires extra memory space for the merging process, which can be a drawback in memory-constrained situations.
//    Merge Sort is a stable sorting algorithm, making it a good choice for applications where stability is important.
//    Merge Sort is not an in-place sorting algorithm, meaning that it requires additional memory space to sort the array.
//    Merge Sort is a comparison-based sorting algorithm, meaning that it compares the elements in the input array to sort them.
//    Merge Sort is a popular sorting algorithm due to its efficiency, stability, and ability to handle large input sizes.
public static void main(String[] args) {
    int[] ans={5,4,3,2,1};
    mergeSortInPlace(ans,0,ans.length-1);
    System.out.println(Arrays.toString(ans));

}
    static int[] mergeSort(int[] arr){
        if(arr.length==1) return arr;

        int mid=arr.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start <= 0) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid + 1, end);
        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (k = 0; k < mix.length; k++) {
            arr[start + k] = mix[k];
        }
    }
    static int[] merge(int[] left , int[] right){
        int[] ans =new int[left.length+right.length];
        int i=0,k=0,j=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }
            else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }

        //now there might be a case that there are elements left in left and right subarray
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;

    }



}
