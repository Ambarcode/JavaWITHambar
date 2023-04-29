package com.ak.Assignment;

import java.util.Arrays;

public class Triangle  {
    //Sum Triangle of array
//    Input : A = {1, 2, 3, 4, 5}
//    Output : [48]
//            [20, 28]
//            [8, 12, 16]
//            [3, 5, 7, 9]
//            [1, 2, 3, 4, 5]
    public static void main(String[] args) {
        sumTriangleOfArray(new int[]{1, 2, 3, 4, 5});
    }


    private static void sumTriangleOfArray(int[] arr){
        //now what will be our base case
        if(arr.length<1){
            return;
        }
        int[] ans =new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
                int sum=arr[i]+arr[i+1];
                ans[i]=sum;
        }

        sumTriangleOfArray(ans);
        System.out.println(Arrays.toString(arr));
    }


}
