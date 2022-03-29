package com.ak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ArrayListExercise {
    // Ques1:Create a list of unique elements taken from the user . Sort and print these elements

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(9);
        list.add(95);
        list.add(951);
        list.add(951);
        list.add(-1);
        list.add(-1);
//        System.out.print("Enter the no. of Integers: ");
//        int N=sc.nextInt();
//
//        //inputting element
//        for (int i = 0; i <N ; i++) {
//            int Temp=sc.nextInt();
//
//            //Note: The .contains method takes an Object argument and when we pass an int type to it , it will be automatically converted to an integer object
//            if (!list.contains(Temp)){
//                list.add(Temp);
//            }
//
//
//        }
//
//        //Now we are using Collections class to sort our ArrayList
//        Collections.sort(list);
//
//        System.out.print("Sorted List: "+list);
//        System.out.println();

        removeDup(list);

    }

    private static void removeDup(ArrayList<Integer> list) {
        System.out.println(list);//[0, 1, 1, 1, 9, 95, 951, 951, -1, -1]
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--; // we are subtracting 1 from to don't let it skip an element
                }
            }

        }
        Collections.sort(list);
        System.out.println(list);
    }
}

class ArraylistExercise2{
    /*
    Ques 2: Create a menu Program with the following options:
    1. Add Element
    2. Remove Element
    3. Display Elements
    4. Exit
    */

    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>();

        System.out.println("1. Add Element");
        System.out.println("2. Remove Element");
        System.out.println("3. Display Element");
        System.out.println("4. Exit");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Choice: ");
        int n =sc.nextInt();

       while (n!=4){

           if (n==1){
               System.out.print("Enter a element to be added : ");
               int elem=sc.nextInt();
               ls.add(elem);

           }
           else if(n==2){
               System.out.print("Enter the element to be removed : ");
               int elem=sc.nextInt();
               //Note: in order to remove the element we had specified we need to create an object
               if (ls.contains(elem)) {
                   ls.remove(elem );

                   //ls.remove(new Integer(elem));

               }
               else {
                   System.out.print("The element does not exist in the list , try another one");
               }
               System.out.println();
           }

           else if(n==3){
               System.out.println(ls);
           }
           else if (n>4){
               System.out.println("Enter a Specified Choice only");
           }
           System.out.print("Enter a Choice: ");
            n =sc.nextInt();

       }


    }
}
