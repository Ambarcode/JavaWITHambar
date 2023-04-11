package com.ak.recurion_Subset_Subsquence_String_Operation;

public class skipString {
    //here we want to skip the occurrence of a particular string subsequence from a string
    public static void main(String[] args) {
        //String ans=skip("Amapplebar");
        String ans=skipNotString("appleambarapp");
        System.out.println(ans);
    }
    public static String  skip(String str){
        if(str.isEmpty()) {
            return "";
        }
        if(str.startsWith("apple")){
            return skip(str.substring(5));
        }
        else {
            return str.charAt(0)+skip(str.substring(1));
        }

    }

    //now we'll look into an interesting question where we'll remove app from the string but not from the apple substring
    public static String  skipNotString(String str){
        if(str.isEmpty()) {
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipNotString(str.substring(3));
        }
        else {
            return str.charAt(0)+skipNotString(str.substring(1));
        }

    }

}
