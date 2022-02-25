package com.ak;

import java.util.Arrays;

public class ArraySort implements Comparable<ArraySort>{
    String name;
    int age;
    public ArraySort(String name,int age){
        this.name=name;
        this.age=age;

    }
    public String toString()
    {
        return name + " " + age;
    }


    @Override
    public int compareTo(ArraySort o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}

class Sample{
    public static void main(String[] args) {
        ArraySort[] as={
                new ArraySort("Ambar kansal",19),new ArraySort("Ayush Shrivastava",5),new ArraySort("aditya",12)
        };
        Arrays.sort(as);
        for (ArraySort index : as) {
            System.out.println(index);

        }
        System.out.println("https://beginnersbook.com/2017/08/comparable-interface-in-java-with-example/");

    }

}
