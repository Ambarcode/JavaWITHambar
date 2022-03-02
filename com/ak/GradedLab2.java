package com.ak;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class GradedLab2 {

    public static void main(String[] args) {

        System.out.println("Name : AMBAR KANSAL SAP ID: 1000015345");
        System.out.println();

        ArrayList<Integer> al=new ArrayList<Integer>(10);

        store(al);
        System.out.println("Original List of random numbers:");
        print(al);
        sort(al);
        System.out.println();
        System.out.println("Sorted List of random numbers:");
        print(al);

        // Here I am Using a LinkedHashset because it doesn't allow duplicate values and store in the same order
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>(al);
        System.out.println();
        System.out.println("Sorted list of random numbers with duplicates removed, if any:");

        // TO use my print method I am again using a ArrayList
        ArrayList<Integer> al1=new ArrayList<Integer>(s);

        print(al1);


    }

    private static void sort(ArrayList<Integer> al) {
        Collections.sort(al);


        // I am not able to understand we have to write logic or use Collection Inbuilt sort method , So I am providing the Implementation

//		for (int i = 0; i < al.size(); i++) {
//
//		    for (int j = al.size() - 1; j > i; j--) {
//		        if (al.get(i) > al.get(j)) {
//
//		            int tmp = al.get(i);
//		            al.get(i) = al.get(j);
//		           al.get(j) = tmp;
//
//		        }
//
//		    }
//
//		}

    }

    private static void print(ArrayList<Integer> al) {
        System.out.println(al);

    }

    private static void store(ArrayList<Integer> al) {
        int a;
        for (int j = 0; j<10; j++)
        {

            a=(int)( Math.random()*100);
            al.add(a);
        }


    }

}
