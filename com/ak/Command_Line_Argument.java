package com.ak;

import java.util.Arrays;
import java.util.Scanner;

public class Command_Line_Argument {
    Scanner sc=new Scanner(System.in);
    static int a=7;
    int b=9;

    static void hello(){
        a=9;
        System.out.println(a);

    }
    void random(){
        b=33;
        a=98;

    }
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);

//
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
        int[] arr=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=sc1.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(a);
        a=70;
        System.out.println(a);

    }
}

class subclass{
    public static void main(String[] args) {
        Command_Line_Argument.a=9;
        Command_Line_Argument B=new Command_Line_Argument();
      //  B.a=9;// This doesn't make any sense as variable is static and belong to the class
        









    }
}
