package com.ak;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

      @Override
    public String toString(){
        return this.age+","+this.name;
    }
}

    public class SingleDimensionalArray {
    int i =200;
    String s =Integer.toString(i); // it will convert an int to a string

        int a =Integer.valueOf(s); // To convert a string into integer


        static int[] arr = new int[5];


        public static void main(String[] args) {
            System.out.println(arr);
            char[] ch = {'a', 'b', 'c', 'd'};
            System.out.println(ch);

        }


    }

    class ArrayClass {
        public static void main(String[] args) {
//        int[] numbers={1,2,0,-9,88,7,30};
//        System.out.println(Arrays.toString(numbers));

            Student[] arr = {
                    new Student(21, "ambar"), new Student(22, "ayush")
            };
            for (Student index : arr) {
                System.out.println(index);

            }
        }
           // System.out.println(Arrays.toString(arr));//  in case of array of abjects we have to override .toString() method by implementing comparable interface


//        Arrays.sort(numbers);
//        for (int index : numbers) {
//            System.out.print(index+" ");


            //    }
//        int[] characters={'A','h','O','L','a','s'};
//        Arrays.sort(characters);
////        for (int index : characters) {
////            System.out.print(index + " ");
////        }
//            // Note: We can sort an array from a particular index to a particular index
//            // Arrays.sort(from index to last index-1)
////
//           Arrays.sort(numbers,1,6); // Not allowed in .sort method
////            for (int index : numbers) {
////            System.out.print(index+" ");
//        Collections.reverseOrder(numbers);


        }
    //****************Object toString() Method in Java**********************

    // We typically generally do use the toString() method to get the string representation of an object //
    // It is very important and readers should be aware that whenever we try to print the object reference then internally toString() method is invoked.
    // If we did not define the toString() method in your class then the Object class toString() method i  s invoked otherwise our implemented or overridden toString() method will be called.


