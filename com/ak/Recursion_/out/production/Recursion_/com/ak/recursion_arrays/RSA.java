package com.ak.recursion_arrays;

public class RSA {
    //search in rotated sorted array
    public static void main(String[] args) {
        int[] arr={2,3,4,9,8,7,56};
        System.out.println(search(arr,56,0,arr.length-1));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) return -1;
        int m = s + (e-s) / 2;
        if (arr[m] == target) return m;

        if (arr[s] <= arr[m]) { //it means it is sorted
            if (target >= arr[s] && target <= arr[m])
                return search(arr, target, s, m - 1);
            else
                return search(arr, target, m + 1, e);
        }

       //if we are here then probably  the other half is sorted
        if (target >= arr[m] && target <= arr[e])
            return search(arr, target, m + 1, e);
        return search(arr, target, s, m - 1); //these are the must cases we hae to include

    }
}
