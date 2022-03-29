package com.ak;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        syntax of for-each loop
        for(TYPE VAR_NAME : ArrayList/Array){
         ...
        }
        */

    // In each iteration, the variable VAR_NAME will hold the value of an element inside the ArrayList/Array , starting from the first element
        //-There is no index

        ArrayList<String> itemsArraylist=new ArrayList<>();
        itemsArraylist.add("item1");
        itemsArraylist.add("item2");
        itemsArraylist.add("item3");

        String[] itemArray ={  "item1","item2","item3"};


        //using forEach loop on Arraylist
        for (String item: itemsArraylist){
            System.out.print(item+" ");
        }

        //using foreach loop in array
        for (String item : itemArray
             ) {
            System.out.print(item+" ");

        }










    }
}
