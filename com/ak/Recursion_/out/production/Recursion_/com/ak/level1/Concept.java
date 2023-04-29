package com.ak.level1;

public class Concept {
    public Concept() {
    }

    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    static int fun(int n) {
        if (n <= 0) {
            return n;
        } else {
            System.out.println(n);
            return fun(n--);
        }
    }

    static int fun1(int n) {
        if (n <= 0) {
            return n;
        } else {
            System.out.println(n);
            --n;
            return fun1(n);
        }
    }
}

