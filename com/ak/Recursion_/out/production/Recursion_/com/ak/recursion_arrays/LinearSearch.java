package com.ak.recursion_arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
       //System.out.println(find(new int[]{2,3,4,5,6},6,0));
//        ArrayList<Integer> list= new ArrayList<>();
//        ArrayList<Integer> ans=  find4(new int[]{4,3,2,5,6,7,6,9,9,6},6,0,list);
//        System.out.println(ans);
        System.out.println(findAllIndex(new int[]{2,3,4,4,5,6},4,0));
    }

    static boolean find(int[] arr, int target, int index){
        if(index==arr.length) return false;
        return arr[index]==target || find(arr, target,index+1);
    }
    //if you also want to return the index
    static int find2(int[] arr,int target , int index){
        if(index==arr.length) return -1;
        if(arr[index]==target){
            return  target;
        }
        else
            return find2(arr, target,index+1);
    }
    static int findIndexLast(int[] arr,int target , int index){
        if(index==-1) return -1;
        if(arr[index]==target){
            return  target;
        }
        else
            return find2(arr, target,index-1);
    }

    //we can also create a arraylist
    static ArrayList<Integer> list=new ArrayList<>();
    static void find3(int[] arr, int target , int index){
        if(index==arr.length) return;
        if(arr[index]==target){
            list.add(index);
        }
        find3(arr, target,index+1);
    }
    static ArrayList<Integer> find4(int[] arr, int target , int index , ArrayList<Integer>list ){
        if(index==arr.length)  return list;
        if(arr[index]==target)
            list.add(index);
        return find4(arr, target,index+1,list);
    }
    private static ArrayList<Integer> findAllIndex(int[] arr, int target , int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length-1) return list;


        //this will be for that function call only
        if(arr[index]==target) list.add(index);

        ArrayList<Integer> ansFromBelowCalls=findAllIndex(arr, target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
