package com.ak;

import java.util.ArrayList;
import java.util.Collections;

class ArrayList_Example {

    // An ArrayList can be defined as a resizable array which is used for dynamic memory location
    // it is also an object

    public static void main(String[] args) {
        // defining an ArrayList

        ArrayList<Integer> integers; //null
        // we can not create arrayList of primitive types
        integers=new ArrayList<>();
        //it is enough to specify type on only one side

        ArrayList<String> fruits=new ArrayList<>();
        // arraylist of doubles

        // it is not mandatory to define the size of arraylist

        //NOTE: In an ArrayList, we can store objects(String,Integer, Boolean, Double ,Character) but we can't store primitive types(int , boolean , double and char....)
        // The size of ArrayList grows as we add elements in it

        //Adding items
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        //by default the add method adds the element in the last of the arraylist

        // Note there is another overloaded add method
        fruits.add(0,"AtIndex0");
        // the other strings are shifted automatically

        //Accessing the item- using the get method
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));

        //Replacing the item using - set method

        fruits.set(2,"Orange");
        //Note Strings are immutable in java so only reference is changed

        //Removing an item
        // We can remove by both i.e. either by passing the element or passing the index
        // using the remove method

        // removing by index
        fruits.remove(1);
        //removing by value
        fruits.remove("Banana");

        // To remove all the elements from the arrayList we have a method clear();
         //fruits.clear();

         //To get the size of arrayList we use the method -size(),which usually depicts the number of elements of the arrayList

        //NOW we will see how to loop through an arraylist
        for (String fruit : fruits) {
            System.out.print(fruit + " ");

        }

        //Sorting an arrayList
        // We use the sort method to sort the arraylist either alphabetically or numerically
        // Here we will use the sort method of Collection class for sorting

        Collections.sort(fruits);
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add(5);
        ls.add(4);
        ls.add(0);
        ls.add(2);
        ls.add(-1);

        ls.remove(1);















        System.out.println(fruits);

    }
}
