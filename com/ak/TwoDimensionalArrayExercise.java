package com.ak;

//Ques 1: Write a Program that prints the sum of rows in a rows in a 2-Dimensional Array
//or
//Ques: Write a Program that prints the sum of rows in a rows in a 2-Dimensional Array
 class TwoDimensionalArrayExercise1{
    public static void main(String[] args) {
    int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
        rowSum(arr);
        colSum(arr);
    }


    private static void colSum(int[][] arr) {
        int sum=0;
        for (int i = 0; i <arr[0].length ; i++) {
            for (int[] ints : arr) {
                sum += ints[i];


            }
            System.out.print("Sum of Column "+i+" : " + sum);
            System.out.println();
            sum=0;
        }
    }

    private static void rowSum(int[][] arr) {
        int sum=0;
        int i=1;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;

            }
            System.out.print("Sum of Row "+i+" : " + sum);
            System.out.println();
            i++;
            sum=0;

        }
    }


}
//Ques 2: Write a Program that print the max of each row in a 2-D array

class TwoDimensionalArrayExercise2{
    public static void main(String[] args) {
        int[][] arr={
                {6,99,-1},
                {0,0,-9},
                {6,4,555,87}

        };
        //MaxElemRow(arr);
        // or we can use an alternative approach in which we are passing each array to a method getMax

        for (int i = 0; i <arr.length; i++) {
            System.out.println("Row  "+ ( i+1) + " :"+ getMax(arr[i]));

        }

        // You can alternatively try this.........
       // MaxElemCol(arr);
    }

    private static int getMax(int[] ints) {
        int max=ints[0];
        for (int anInt : ints) {
            max = Math.max(max, anInt);
        }
        return max;


    }

    private static void MaxElemCol(int[][] arr) {

    }

    private static void MaxElemRow(int[][] arr) {
        //int max=arr[0][0];
        int i=0;
        for (int[] ints : arr) {
            int max=arr[i][0];
            for (int anInt : ints) {
                max = Math.max(anInt, max);

            }
            System.out.print("MAX Elem of Row "+ (i+1)+" :"+max);
            System.out.println();
            i++;
        }
    }
}
