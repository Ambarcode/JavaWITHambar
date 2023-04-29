package com.ak.Assignment;

public class MinAndMax {

    //recursive function for finding minimum of the array

    public static void main(String[] args) {
        int[] arr={2,1,3,4,-9,599};
        System.out.println(findMax(arr,0));
    }
    public static int findMin(int[] arr, int index){
        if(index==arr.length-1) return arr[index];
        int minInSubArr=findMin(arr,index+1);
        return Math.min(arr[index], minInSubArr);
    }
    public static int findMax(int[] arr, int index){
        if(index==arr.length-1) return arr[index];
        int minInSubArr=findMax(arr,index+1);
        return Math.max(arr[index], minInSubArr);
    }
}
