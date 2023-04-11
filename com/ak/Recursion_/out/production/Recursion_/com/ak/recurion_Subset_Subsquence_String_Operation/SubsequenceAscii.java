package com.ak.recurion_Subset_Subsquence_String_Operation;

import java.util.ArrayList;

public class SubsequenceAscii {
    //to get the ascii value of a character we can simply , so the following
    //ch+0---> as it will automatically cast it into an integer
    public static void main(String[] args) {
/*
        char ch='a';
        System.out.println(ch+0);
*/
        subsetAscii2("","abc");

    }
    public static  void subsetAscii(String up , String pr){
        if(pr.isEmpty()){
            System.out.println(up+" ");
            return;
        }
        char ch=pr.charAt(0);
        subsetAscii(up+(ch+0)+" ",pr.substring(1));
        subsetAscii(up,pr.substring(1));
    }
    public static  void subsetAscii2(String up , String pr){
        if(pr.isEmpty()){
            System.out.print(up+" ");
            return;
        }
        char ch=pr.charAt(0);
        subsetAscii2(up+pr,pr.substring(1));
        subsetAscii2(up,pr.substring(1));
        subsetAscii2(up+(ch+0),pr.substring(1));

    }
    public static ArrayList<String> subsetAscii3(String up , String pr){
        if(pr.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(up);
            return list;
        }
        char ch=pr.charAt(0);
        ArrayList<String> first =subsetAscii3(up+pr,pr.substring(1));
        ArrayList<String> Second= subsetAscii3(up,pr.substring(1));
        ArrayList<String> third=subsetAscii3(up+(ch+0),pr.substring(1));

        first.addAll(Second);
        first.addAll(third);

        return first;

    }


}
