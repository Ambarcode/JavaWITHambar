package com.ak.level1;

public class ReduceNumberToZero {
    public static void main(String[] args) {

    }

    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public int helper(int num, int steps) {
        if (num == 0) return steps;
        if (num % 2 == 0) return helper(num / 10, steps +1);

    else return helper(num-1, steps+1);
}
}