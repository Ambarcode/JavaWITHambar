package com.ak.recurion_Subset_Subsquence_String_Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterativeSubsequence {
    //now we'll see how to print subsets using iteration
//    An array arr with three integers is declared and initialized: int[] arr={1,2,3};.
//
//    An empty ArrayList outer of List type is created: List<List<Integer>> outer=new ArrayList<>();.
//
//    An empty ArrayList of Integer type is added to outer: outer.add(new ArrayList<>());.
//
//    A new ArrayList of Integer type is created, which is a copy of the first list in outer (which is currently empty): List<Integer> internal =new ArrayList<>(outer.get(0));.
//
//    The new ArrayList created in step 4 is added to outer: outer.add(internal);. At this point, outer contains two empty lists.
//
//    The contents of outer are printed to the console using System.out.println(outer);.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans=generateSubsets2(arr);
        System.out.println(ans);
 //        iterativeSubset(arr);
//        System.out.println();
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        List<List<Integer>> ans=generateSubsets(list);
//        System.out.println(ans);

    }

    private static void iterativeSubset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());


        for (int nums : arr) {
            int n = outer.size();
            for (int i = 0; i <n ; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);
            }
            // System.out.println(outer);
        }
        System.out.println(outer);
    }

  //  Now we will see , how to print subsets of an array using recursion
  public static ArrayList<String> findAllSubsets3(int[] arr) {

        return findAllSubsets3Helper("", arr, 0);
  }

    private static ArrayList<String> findAllSubsets3Helper(String subset, int[] arr, int index) {
        if (index == arr.length) {
            ArrayList<String> list = new ArrayList<>();
            list.add(subset);
            return list;
        }

        ArrayList<String> right = findAllSubsets3Helper(subset + arr[index], arr, index + 1);
        ArrayList<String> left = findAllSubsets3Helper(subset, arr, index + 1);
        right.addAll(left);
        return right;
    }
    public static List<List<Integer>> generateSubsets(List<Integer> nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsetsHelper(nums, new ArrayList<>(), subsets, 0);
        return subsets;
    }

    private static void generateSubsetsHelper(List<Integer> nums, List<Integer> current, List<List<Integer>> subsets, int index) {
        if (index == nums.size()) {
            subsets.add(new ArrayList<>(current));
            return;
        }
        generateSubsetsHelper(nums, current, subsets, index+1); // exclude the current element
        List<Integer> copy = new ArrayList<>(current);
        copy.add(nums.get(index));
        generateSubsetsHelper(nums, copy, subsets, index+1); // include the current element
    }

    public static List<List<Integer>> generateSubsets2(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsetsHelper2(nums, new ArrayList<>(), subsets, 0);
        return subsets;
    }

    private static void generateSubsetsHelper2(int[] nums, List<Integer> current, List<List<Integer>> subsets, int index) {
        if (index == nums.length) {
            subsets.add(new ArrayList<>(current));
            return;
        }
        generateSubsetsHelper2(nums, current, subsets, index+1); // exclude the current element
        List<Integer> copy = new ArrayList<>(current);
        copy.add(nums[index]);
        generateSubsetsHelper2(nums, copy, subsets, index+1); // include the current element
    }

    //Now let's handle subset with duplicates
    //Steps to eliminate duplicate subsets:-
    //If you find a duplicate element , only add it in the newly created subset of previous step
    //Because of above point , the duplicates have to be together therefore we have to sort the array
    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }


}
