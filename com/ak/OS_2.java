package com.ak;

import java.util.Arrays;
import java.util.Scanner;

class OS_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements-> ");
        System.out.println("");
        int N=sc.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Enter Element"+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int[] new_arr=findTwoElement(arr ,N);
        System.out.println(Arrays.toString(new_arr));
    }

     public static int[] findTwoElement(int[] arr, int n) {
         int miss = 0, repeat = 0;
         // finding missing and repeating elements
         for (int i = 0; i < n; ++i)
         {
             if(i == n-1)
                 break;

             if(arr[i] == arr[i+1])
                 repeat = arr[i];

             if((arr[i+1] - arr[i])!= 1)
                 miss = i+1;
         }
         int[] new_arr={repeat , miss};
         return  new_arr;
     }
}

