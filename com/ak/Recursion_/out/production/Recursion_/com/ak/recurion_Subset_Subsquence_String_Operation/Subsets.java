package com.ak.recurion_Subset_Subsquence_String_Operation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subsets {
    //now what is subset
    //suppose you have an array , arr=[1,2,3,4,5]
    //Then what are the subsets of the array
    //The subsets of the array is : [1,2,3,12,23,13,123]
    //now we'll look unto an approach , i.e. how to print the subset of the array
    public static void main(String[] args) {
        String str="Ambar";
      // findAllSubsets("","abc");
//       ArrayList<String> list =new ArrayList<>();
//      findAllSubsets2("","abc",list);
//        System.out.println(list);
        System.out.println(findAllSubsets3("","abc"));
        System.out.println();
        System.out.println(findAllSubsets4("abc"));
    }
    public static void findAllSubsets(String up, String pr){
        if(pr.isEmpty()){
            System.out.println(up);
            return;
        }

        char ch=pr.charAt(0);
        findAllSubsets(up+ch , pr.substring(1));
        findAllSubsets(up,pr.substring(1));
    }
    //Another approach , where we are passing Arraylist in the argument
    public static void findAllSubsets2(String up, String pr, ArrayList<String> list){
        if(pr.isEmpty()){
            list.add(up);
            return ;
        }

        char ch=pr.charAt(0);
        findAllSubsets2(up+ch , pr.substring(1),list);
        findAllSubsets2(up,pr.substring(1),list);
    }

    //Now Suppose another approach where we don't want to pass the list in the Argument
    //We'll create the list locally and will return it

    public static ArrayList<String> findAllSubsets3(String up , String pr){
        if(pr.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(up);
            return list;
        }

        char c=pr.charAt(0);
        ArrayList<String> right=findAllSubsets3(up+c,pr.substring(1));
        ArrayList<String> left=findAllSubsets3(up,pr.substring(1));

        right.addAll(left);
        return right;
    }

    public static ArrayList<String> findAllSubsets4(String str) {
     //we can use the helper function , if we are provided to just pass only one string
        return findAllSubsets3("", str);
    }
    private static ArrayList<String> findAllSubsets3_(String up, String pr) {
        if(pr.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }

        char c = pr.charAt(0);
        ArrayList<String> right = findAllSubsets3_(up + c, pr.substring(1));
        ArrayList<String> left = findAllSubsets3_(up, pr.substring(1));

        right.addAll(left);
        return right;
    }
}


