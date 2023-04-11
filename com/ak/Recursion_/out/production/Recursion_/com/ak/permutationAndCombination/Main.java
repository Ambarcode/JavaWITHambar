package com.ak.permutationAndCombination;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        ArrayList<Integer> list3 =new ArrayList<>();
        ArrayList<Integer> list4 =new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);

        list2.addAll(list1);
        System.out.println(list2);
    }
}
