package com.ak.recurion_Subset_Subsquence_String_Operation;

public class SkipCharacter {
    //In this , we'll return the answer string by removing all the occurrences of the specified character
    //suppose for example
    //input string :-"ambar"
    //Skip Character:-a
    //resultant string:- "mbr"
    public static void main(String[] args) {
          //skip("","ambar");
        String ans=skip2("ambar");
        System.out.println(ans);
    }
    public static void  skip(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1)); //move the pointer to next iteration without adding the character in the processed string
        }
         else
             skip(p+ch,up.substring(1));  //add the character to the processed string

    }

    //Now we look into another approach of solving it , instead of passing another string , we can do it by just passing only one string:
    //We will use the approach: ch+ Recursion
    //i.e. if the character is not "target character" , we'll just add the present character+ the characters that will come from the future calls

    public static String skip2(String str){
        if(str.equals("")){
            return "";
        }

        char ch=str.charAt(0);
        if (ch == 'a') {
            return skip2(str.substring(1));
        }
        else{
           return ch+skip2(str.substring(1));
        }
    }
}
