package com.ak;

import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] args) {
        int[] numbers1 ={5,4,3,2,1};
        int[] numbers2 ={5,4,3,2,1};
        int[] numbers3 ={5,4,3,2,1};
        int[] numbers4 ={5,4,3,2,1};

        System.out.println(numbers1==numbers2); // It will just compare the address
        System.out.println(Arrays.equals(numbers1, numbers2));

        // Comparing Arrays of object
        String[] s={"abg","ullu","papaniginea","johndeer"};
        String[] s1={"abg","ullu","papaniginea","johndeer"};
        System.out.println(Arrays.equals(s,s1));
    }
}

//  Overriding equal method for our own class
