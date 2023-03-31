package com.ak.level1;

public class CountNumberOfZero {
    public CountNumberOfZero() {
    }

    public static void main(String[] args) {
        System.out.println(countZero(209000));
    }

    private static int countZero(int i) {
        return helper(i, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        } else {
            int rem = n % 10;
            return rem == 0 ? helper(n / 10, c + 1) : helper(n / 10, c);
        }
    }
}
