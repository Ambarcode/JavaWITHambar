package com.ak;

import java.util.Arrays;

public class BinarySearch2DArrays {
    // In this we are going to talk about binary search in 2-D array , or we can say binary search in Matrices
    //the approach is simple we will try to eliminate row and column

    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {7,8,9},
                {10,11,12},
        };
        int t=1;
        System.out.println(Arrays.toString(search(arr,t)));

    }
    public static int[] search( int[][] arr, int target){
        int start=0 ; // here start =row
        int end=arr.length-1; // and end =col

        while (start<arr.length && end>=0){
            if (arr[start][end]==target){
                return new int[]{start,end};
            }
            if(arr[start][end] < target){
                start++;
            }
            else
                end--;
        }
        return new int[]{-1,-1};
    }
}
//in the previous Question the matrix was not like strictly sorted
//now lets talk about a strictly sorted matrix
/*
*   1  2  3  4
*   5  6  7  8
*   9  10 11 12
*  13  14 15 16
*
*/
// first element of a particular row is greater than last element of the previous row
// so , our approach is
//take a middle row and

class StrictlySortedBinaryArray{
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        int target=3;
        System.out.println(Arrays.toString(search(arr,target)));
        }

    static int[] BinarySearch(int[][] arr , int row , int cStart , int cEnd,int target){
        while (cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if (arr[row][mid]<target){
                cStart=mid+1;
            }
            else
                cEnd=mid-1;
        }
        return new int[]{-1,-1};
    }
    public static int[] search (int[][] arr,int target){
    int row=arr.length;
    int col=arr[0].length;
    // we also have to include the case where the array must be empty
    if (col==0){
        return new int[]{-1,-1};
    }
    if (row==1){
        return BinarySearch(arr,0,0,col-1,target);
    }
    int rowStart=0;
    int rowEnd=arr.length-1;
    int colMid=col/2;
    while (rowStart<(rowEnd-1)){ //it will run until two rows are remaining
        int mid=rowStart+(rowEnd-rowStart)/2;
        if (arr[mid][colMid]==target){
            return new int[]{mid,colMid};
        }
        if (arr[mid][colMid]<target){
            rowEnd=mid;
        }
        else{
            rowStart=mid;
        }

    }
    //now we are left with two rows , we have to check whether the target element is present specifically in the column of two rows
    if (arr[rowStart][colMid]==target){
        return new int[]{rowStart,colMid};
    }
    else if(arr[rowStart+1][colMid]==target){
        return new int[]{rowStart+1,colMid};
    }
    //search in first half
        if (target<=arr[rowStart][colMid-1]){
            return BinarySearch(arr,rowStart,0,colMid-1,target);
        }

    //search in second half
    if (target<=arr[rowStart][colMid+1] && target>=arr[rowStart][col-1]){
        return BinarySearch(arr,rowStart,colMid+1,col-1,target);
    }
    //search in third half
    if (target<=arr[rowStart+1][colMid-1]){
        return BinarySearch(arr,rowStart+1,0,colMid-1,target);
    }
    else
        return BinarySearch(arr,rowStart+1,colMid+1,col-1,target);
    }

    //in the above we had used a row eliminating approach
    //now using a column eliminating approach

    public static int[] searchByEliminatingCol(int[][] arr , int target){
        int row=arr.length;
        int col=arr[0].length;

        if (col==0){
            return new int[]{-1,-1};
        }
        if(col==1){
            return BinarySearch2(arr,0,0,row-1,target);

        }
        int cStart=0;
        int cEnd=col-1;
        int rMid=row/2;

        while (cStart<(cEnd-1)){
            int mid=cStart+(cEnd-cStart)/2;
            if (arr[rMid][mid]==target){
                return new int[]{rMid,mid};
            }
            if (arr[rMid][mid]>target){
                cStart=mid;
            }
            else
                cEnd=mid;
        }
        if (arr[rMid][cStart]==target){
            return new int[]{rMid,cStart};
        }
        else if(arr[rMid][cStart+1]==target){
            return new int[]{rMid,cStart+1};
        }
        //search in first upper half
        if (target<=arr[rMid-1][cStart]){
            return BinarySearch2(arr,cStart,0,rMid-1,target);
        }

        //search in second half
        if (target<=arr[rMid+1][cStart] && target>=arr[row-1][cStart]){
            return BinarySearch2(arr,cStart,rMid+1,row-1,target);
        }
        //search in third half
        if (target<=arr[rMid][cStart+1]){
            return BinarySearch2(arr,cStart+1,0,rMid-1,target);
        }
        else
            return BinarySearch2(arr,cStart+1,rMid+1,row-1,target);

    }
    static int[] BinarySearch2(int[][] arr , int col, int rStart , int rEnd,int target){
        while (rStart<=rEnd){
            int mid=rStart+(rEnd-rStart)/2;
            if(arr[mid][col]==target){
                return new int[]{col,mid};
            }
            if (arr[mid][col]<target){
                rStart=mid+1;
            }
            else
                rEnd=mid-1;
        }
        return new int[]{-1,-1};
    }


}

class StrictlySortedBinaryArray2{
    public static void main(String[] args) {
        int arr[][] = { { 0, 6, 8, 9, 11 },
                { 20, 22, 28, 29, 31 },
                { 36, 38, 50, 61, 63 },
                { 64, 66, 100, 122, 128 } };
        int target=222;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int[] search(int[][] arr,int target){
        int low=0;
        int end=arr.length-1;
        int col=arr[0].length-1;
        while (low<=end){
            int mid=low+(end-low)/2;
            if (arr[mid][0]==target){ //checks the leftmost index
                return new int[]{mid , 0};
            }
            if (arr[mid][col]==target){ //checks the rightmost index
                return new int[]{mid,col};
            }
            if (target>arr[mid][0] && target<arr[mid][col]){ //this means the element is present is within the row
                return binarySearch(arr,mid,0,col,target);
            }
            if (target<arr[mid][0]) end=mid-1;

             if(target>arr[mid][col]) low =mid+1;

        }
        return new int[]{-1,-1};
    }
    public static int[] binarySearch(int[][] arr , int row , int cStart ,int cEnd , int target){
        while (cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if (arr[row][mid]==target){
                return new int[]{row,cStart};
            }
            if (target>=arr[row][mid]){ //if true: we'll check in second half
                cStart=mid+1;
            }
            else //we'll check in first half
                cEnd=mid-1;
        }
        return new int[]{-1,-1};
    }


}

