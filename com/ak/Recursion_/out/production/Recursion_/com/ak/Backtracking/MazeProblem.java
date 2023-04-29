package com.ak.Backtracking;

import java.util.ArrayList;

public class MazeProblem {
    //Here we'll count the path for maze runner game
    public static void main(String[] args) {
        //There are 6 ways to go from point (3,3) to (0,0)
//        System.out.println(countAllPaths(3,3));
//        printPaths("",3,3);
//        ArrayList<String> ans=printPaths2("",3,3);
//        System.out.println(ans);
        boolean[][] matrix={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        ArrayList<String> res= pathRestriction("",0,0,matrix);
        System.out.println(res);
    }

    //method to print no. of ways to reach from a point to (0,0)
    public static int countAllPaths(int r, int c){
        if(r==1 || c==1) return 1;

        int count=0;
        count+=countAllPaths(r-1,c);
        count+=countAllPaths(r,c-1);
        return count;

    }

    //method to print paths
    public static void printPaths(String p,int r, int c){
        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }

        if(r>1) {
            printPaths(p + "D", r - 1, c);
        }
        if (c > 1) {
            printPaths(p+"R",r,c-1);
        }

    }

    //now we'll store all the paths in the arraylist
    public static ArrayList<String> printPaths2(String p, int r, int c){
        if(r==1 && c==1) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
       ArrayList<String> ans=new ArrayList<>();
        if(r>1) {
           ans.addAll(printPaths2(p + "D", r - 1, c));
        }
        if (c > 1) {
            ans.addAll(printPaths2(p+"R",r,c-1));
        }
        return ans;
    }

    //Now what if we allow one , more direction i.e. diagonally

    public static ArrayList<String> printPaths3(String p, int r, int c){
        if(r==1 && c==1) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1) {
            ans.addAll(printPaths3(p + "D", r - 1, c));
        }

        if(r>1 && c>1){
            ans.addAll (printPaths3(p+"d",r-1,c-1));
        }

        if (c > 1) {
            ans.addAll(printPaths3(p+"R",r,c-1));
        }
        return ans;
    }

    //Now we'll see Maze with some Obstacles
    public static ArrayList<String> pathRestriction(String p, int r, int c, boolean[][] matrix){
        if(r== matrix.length-1&& c==matrix[0].length-1) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(!matrix[r][c])
            return ans;
        if(r<matrix.length-1) {
            ans.addAll(pathRestriction(p + "D", r + 1, c,matrix));
        }
        if (c < matrix[0].length-1) {
            ans.addAll(pathRestriction(p+"R",r,c+1,matrix));
        }
        return ans;
    }
}


