package com.ak;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;


// Ques 1:  Write a program that fills an array with n integers entered by a user
  class ArrayExercise1 {
     public static void main(String[] args) {
         //method to declare the size of array
         int n=range();
         //method to check range
         rangeCheck(n);
         //Creating an array
         //int[] arr=new int[n];

         //creating a point array
         Point[] point =new Point[n];


         //array initialization
         //arrayInput(arr,n);

         //Point initialization
         pointInput(point,n);

         //printing array
         //arrayPrint(arr);

         //printing point array
         printPointArray(point,n);


     }

    private static void printPointArray(Point[] point, int n) {
        for (int i = 0; i <n ; i++) {
            System.out.println("(" + point[i].x +" ," + point[i].y +")");

        }
    }

    private static void pointInput(Point[] point,int n) {
         Scanner sc=new Scanner(System.in);
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter the value of x and y for point "+ (i+1)+ ":");
            point[i]=new Point(sc.nextInt(), sc.nextInt());

        }
    }

    private static void arrayPrint(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static void arrayInput(int[] arr,int n) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
    }

    private static void rangeCheck(int n) {
         if(n<=0 || n>=20){
             System.out.println("Unspecified Value");
             System.exit(0);
         }
    }




    private static int range() {
         System.out.print("Enter the size of array(min=0 and max=20): ");
         return new Scanner(System.in).nextInt();
     }

 }
//Ques: Write a Program to display sum , product and average of an integer array

 class ArrayExercise2 {
    public static void main(String[] args) {
        int[] arr={1,5,-1,2};
        sum(arr);
        product(arr);
        average(arr);

    }

    private static void average(int[] arr) {
        int sum=0;
        for (int j : arr) {
            sum += j;

        }
        double dSum=(double)sum;
        double average=dSum/arr.length;

        System.out.println("Average of array elements are : "+ average);
    }



    private static void product(int[] arr) {
        int prod=1;
        for (int j : arr) {
            prod *= j;

        }
        System.out.println("Product of array elements is : "+ prod);
    }


    private static void sum(int[] arr) {
        int sum=0;
        for (int j : arr) {
            sum += j;

        }
        System.out.println("Sum of array  elements is : "+ sum);
    }
}
//Ques: Write a Program that displays the number of occurrences of an element in the array
class ArrayExercise3{

    public static void main(String[] args) {
        int[] duplicateArray = {1, 9, 0, 5, 6, 2, 7, 9, 0, 1, 1, 5, 5, 5, 57};
        Arrays.sort(duplicateArray);
        int len = duplicateArray.length;
        int[] distinctArray = new int[20];
        int index = 0;

        for (int i = 0; i < len; i++) {
            while (i < len - 1 && duplicateArray[i] == duplicateArray[i + 1])
                i++;
            distinctArray[index] = duplicateArray[i];
            index++;
        }
        
        elemOccurence(duplicateArray,distinctArray,index);

    }

    private static void elemOccurence(int[] duplicateArray, int[] distinctArray, int index) {
        for (int i = 0; i <index ; i++) {
            int count=0;
            int elem=distinctArray[i];
            for (int j = 0; j <duplicateArray.length; j++) {
                if (elem==duplicateArray[j]) count++;
            }
            System.out.println(" Element "+ " " + elem +" occurs "+ count +" Times ");
        }
    }
}

// Write a program to find the maximum and minimum element of an array

class ArrayExercise4{
    public static void main(String[] args) {
        int[] arr={1 ,98,0 ,7 ,9};
        int min =arr[0];
        int max=arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<min) min=arr[i];
            if (arr[i]>max) max=arr[i];

            // we can also use the conditional operator
           // min=((arr[i]<min)?arr[i]:min);


            // or we can also use math class to calculate the maximum and minimum value
            min=(Math.min(arr[i], min));
        }



        System.out.println("Max elem: "+ max);
        System.out.println("Min elem: "+ min);
    }
}

// Ques:  Write a Program that places the odd element of an array before the even element

class ArrayExercise5{
    public static void main(String[] args) {
        int[] arr={1,4,5,2,9};
       // int[] duplicateArr=arr.clone(); // here we are using clone method to copy the content of arr inside duplicateArr
        int[] arr2=new int[arr.length];

        // defining the index for arr2
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2!=0){
                arr2[index]=arr[i];
                index++;
            }
        }
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]%2==0) {
                arr2[index] = arr[i];
                index++;
            }
        }
    //printing array elements

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

}

// The time complexity of above program is of Order of O(n*n)

// Using a second approach in which we are using a single for loop

class ArrayExercise5_2{
    public static void main(String[] args) {


        int[] arr={1,4,5,2,9};

        int[] arr2=new int[arr.length];

        int j=0;
        int k=arr.length-1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2!=0){
                arr2[j++]=arr[i];
            }
            else
                arr2[k--]=arr[i];
        }

        System.out.print("Original Array : "+Arrays.toString(arr));
        System.out.println();
        System.out.print("Updated Array : "+Arrays.toString(arr2));









    }
}



