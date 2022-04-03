package com.ak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] arr={2,10,12,13,25,70};
	//here we will assume that array is sorted
       // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 10;
        int start=0 , end=arr.length-1;

        int index;
        if(arr[start]<arr[end]) {
            index = BinarySearch(arr, target, start, end);
        }
        else {
            index = BinarySearch2(arr, target, start, end);
        }
        System.out.println("element exist at " + index + " index");


    }
    //return the index , if not found return -1
    public static int BinarySearch(int[] arr, int target, int start, int end) { // Case: array is sorted in ascending order
        //int start_ind=0,last_ind=arr.length-1;
        int mid;
        while (start<=end){
            //mid=(start_ind+last_in)/2;
            // but there is a problem  that integer has a fixed size
            //there might be a possibility that start+end may exceed the range o int
            // so ,we'll follow an approach i.e. start+(end-start)/2
            mid=start+(end-start)/2;
            if (target<arr[mid]){
                end =mid-1;

            }else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return  mid;
            }
        }

       return -1;
    }


    public static int BinarySearch2(int[] arr, int target ,int start,int end){//Case: when array is sorted in descending order
        int mid;
        while (start<=end){
            mid =start+(end-start)/2;
            if (target>arr[mid]){
                end=mid-1;
            }else if (target<arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

class BinarySearch{
    public static void main(String[] args) {
        int[] arr={0,0,1,1,19,34,100}; // we can also include the case if the target element is present more than once
        int target = 1;
        int start=0 , end=arr.length-1;
        int index = orderAgnosticsBinarySearch(arr, target, start, end);
        System.out.println("element exist at " + index + " index");

    }

    public static int orderAgnosticsBinarySearch(int[] arr, int target, int start, int last){
        //In orderAgnostics binary search our main goal is to check first that the array is sorted in which pattern i.e. Ascending or Descending ,then we will apply binary search according to it
        int mid;
        Boolean isAsc=arr[start]<arr[last];
        while (start<=last){

            mid=start+(last-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    last = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target>arr[mid]){
                    last=mid-1;
                }else {
                    start=mid+1;
                }

            }
        }

        return -1;

    }

}
