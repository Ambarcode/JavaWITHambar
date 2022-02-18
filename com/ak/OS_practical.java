package com.ak;

import java.util.Arrays;
import java.util.Scanner;


  class Practise {
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
            Practise Find=new Practise();
            Arrays.sort(arr);
            System.out.println("Smallest Integer:"+Find.smallestpositive(arr,N));


    }
    public int smallestpositive(int[] arr,int N){
        int target=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                return target;
            }
            else
                target=target+arr[i];
        }
        return target;
    }
}
