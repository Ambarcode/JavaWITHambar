package com.ak.permutationAndCombination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FindAllPermutation {
    //in this , we'll find all the permutation of the string or array given
    public static void main(String[] args) {
       // findPermutation("", "ambar");
//        ArrayList<String> ans=findPermutation3("","abc");
//        System.out.println(ans);
//        List<String> list=new ArrayList<>();
//        list=  letterCombinations("88");
//        System.out.println(list);

//       ArrayList<String> ans= dicePermutation2("",4);
//        System.out.println(ans);

//        int count=countDicePermutation("",4);
//        System.out.println(count);
//        findPermutation("","abc");
        String ans="Ambar";
        System.out.println(ans.substring(0,1));
    }

    public static void findPermutation(String pr, String up) {
        if (up.isEmpty()) {
            System.out.println(pr);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= pr.length(); i++) {
            String f = pr.substring(0, i);
            String s = pr.substring(i, pr.length());
            findPermutation(f + ch + s, up.substring(1));

        }
    }

    // Now , we'll try to store the results into the arraylist

    //1. Way pass the list into the argument
    private static void findPermutation2(String pr, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(pr);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= pr.length(); i++) {
            String f = pr.substring(0, i);
            String s = pr.substring(i, pr.length());
            findPermutation(f + ch + s, up.substring(1));
        }
    }

    //2. Another way is to create the list in the method body and return it
    private static ArrayList<String> findPermutation3(String pr, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list =new ArrayList<>();
            list.add(pr);
            return list;
        }

        char ch = up.charAt(0);
        //local to this function call
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i <= pr.length(); i++) {
            String f = pr.substring(0, i);
            String s = pr.substring(i, pr.length());
            ans.addAll(findPermutation3(f + ch + s, up.substring(1))); //this method adds all the elements of the above list
        }
        return ans;
    }

    private static int countPermutation(String pr, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            return 1;
        }

        char ch = up.charAt(0);
        //local to this function call
        int count = 0;
        for (int i = 0; i <= pr.length(); i++) {
            String f = pr.substring(0, i);
            String s = pr.substring(i, pr.length());
            count += countPermutation(f + ch + s, up.substring(1));

        }
        return count;
    }

    //Now we will generate array Permutation

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); // Create a list to store all permutations
        List<Integer> numList = new ArrayList<>(); // Create a list to store input numbers
        for (int num : nums) {
            numList.add(num); // Add input numbers to the list
        }

        helper(numList, 0, ans); // Call the helper function to generate all permutations
        return ans; // Return the list of all permutations
    }

    private void helper(List<Integer> nums, int i, List<List<Integer>> ans) {
        // Base case: all elements have been fixed, so add current permutation to ans list
        if (i == nums.size()) {
            ans.add(new ArrayList<>(nums));
            return;
        }

        // Recursive case: fix one element at a time and generate all permutations
        for (int j = i; j < nums.size(); j++) {
            Collections.swap(nums, i, j); // Swap the ith and jth element to fix the ith element
            helper(nums, i + 1, ans); // Recursively generate all permutations by fixing the (i+1)th element
            Collections.swap(nums, i, j); // Backtrack by swapping back the ith and jth element
        }
    }

//    public static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        permuteHelper(new ArrayList<>(), nums, result);
//        return result;
//    }
//
//    private static void permuteHelper(List<Integer> current, int[] nums, List<List<Integer>> result) {
//        if (current.size() == nums.length) {
//            result.add(new ArrayList<>(current));
//            return;
//        }
//
//        for (int num : nums) {
//            if (current.contains(num)) {
//                continue;
//            }
//            current.add(num);
//            permuteHelper(current, nums, result);
//            current.remove(current.size() - 1);
//        }
//    }


    public static List<String> letterCombinations(String digits) {

          ArrayList<String> list=new ArrayList<>();
          helperForLetter("",digits,list);
          return list;
    }
    private static void helperForLetter(String up,String pr,  ArrayList<String> list) {
//        if (pr.isEmpty()) {
//            list.add(up);
//            return;
//        }
//        int digit=pr.charAt(0)-'0';
//        for(int i=(digit-1)*3; i<digit*3;i++){
//            char ch=(char)('a'+i);
//            helperForLetter(up+ch,pr.substring(1),list);
//        }
        if (pr.isEmpty()) {
            list.add(up);
            return;
        }
        int digit=pr.charAt(0)-'0';
        int extraFor7and9=0;
        //as 7 and 9 contains 4 alphabets
        if(digit==7 || digit==9) extraFor7and9=1;
        //we also have to revert the value back to 3 for 8
        for(int i=(digit-2)*3; i<(digit-1)*3+extraFor7and9;i++){
            char ch=(char)('a'+i);
            helperForLetter(up+ch,pr.substring(1),list);
        }
    }

    //Now , we have to modify the question such that the alphabets corresponding to a digit starts from 2
    //https://leetcode.com/problems/letter-combinations-of-a-phone-number/solutions/
    public static List<String> letterCombinations2(String digits) {

        ArrayList<String> list=new ArrayList<>();
        //if string contains null character
        if(digits.length()==0) return list;
        helperForLetter2("",digits,list);
        return list;
    }
    private static void helperForLetter2(String up,String pr,  ArrayList<String> list) {
         if (pr.isEmpty()) {
            list.add(up);
            return;
        }
        int digit=pr.charAt(0)-'0';
        int extraFor7and9=0;
        int extraFor8=0;
        //as 7 and 9 contains 4 alphabets
        if(digit==7 || digit==9){
            extraFor7and9=1;
        }
        if(digit==8 || digit==9){
            extraFor8=1;
        }
        //we also have to revert the value back to 3 for 8
        for(int i=(digit-2)*3+(extraFor8); i<(digit-1)*3+(extraFor7and9+extraFor8);i++){
            char ch=(char)('a'+i);
            helperForLetter2(up+ch,pr.substring(1),list);
        }
    }

    //Now we'll do a question of Dice Permutation to form a Targeted Sum
     static void dicePermutation(String up , int target) {
        if (target == 0) {
            System.out.println(up);
            return;
        }

        for (int i = 1; i <= 6 && i<=target ;i++) {
                dicePermutation(up+i,target-i);
        }
    }

    //Now , We'll store it in a ArrayList
    static  ArrayList<String> dicePermutation2(String up , int target) {
        if (target == 0) {
            ArrayList<String> list =new ArrayList<>();
            list.add(up);
            return list;
        }

        ArrayList<String> ans= new ArrayList<>();
        for (int i = 1; i <= 6 && i<=target ;i++) {
            ans.addAll(dicePermutation2(up+i,target-i));
        }
        return ans;
    }

    //Now what if there are multiple faces
    static  ArrayList<String> diceFace(String up , int target,int face) {
        if (target == 0) {
            ArrayList<String> list =new ArrayList<>();
            list.add(up);
            return list;
        }

        ArrayList<String> ans= new ArrayList<>();
        for (int i = 1; i <= face && i<=target ;i++) {
            ans.addAll(diceFace(up+i,target-i,face));
        }
        return ans;
    }

//    //Now what if there are multiple dices
//    public static int numRollsToTarget(int n, int k, int target) {
//        HashMap<String, Integer> memo = new HashMap<>();
//        return numRollsToTargetHelper(n, k, target, memo);
//    }
//
////    private static int numRollsToTargetHelper(int n, int k, int target, HashMap<String, Integer> memo) {
//        if (n == 0 && target == 0) {
//            return 1;
//        } else if (n == 0 || target == 0) {
//            return 0;
//        }
//
//        String key = n + "-" + target;
//        if (memo.containsKey(key)) {
//            return memo.get(key);
//        }
//
//        int ways = 0;
//        for (int i = 1; i <= k; i++) {
//            if (i <= target) {
//                ways = (ways + numRollsToTargetHelper(n - 1, k, target - i, memo)) % 1000000007;
//            }
//        }
//
//        memo.put(key, ways);
//        return ways;
//    }

    //Now we'll count total number of permutation
    static int countDicePermutation(String up , int target) {
        if (target == 0) {
           return 1;

        }
        int count=0;
        for (int i = 1; i <= 6 && i<=target ;i++) {
           count+=countDicePermutation(up+i,target-i);
        }
        return count;
    }
}

