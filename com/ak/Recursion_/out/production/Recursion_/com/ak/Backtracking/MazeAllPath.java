package com.ak.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MazeAllPath {
    public static void main(String[] args) {
        boolean[][] matrix={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        int[][] path=new int[matrix.length][matrix[0].length];
//        printAllPaths2("",0,0,matrix);

        ArrayList<ArrayList<String>> ans=findAllPathsArray(matrix);
        System.out.println(ans);

    }


    //It will give Stack Overflow error
    public static void printAllPaths(String p,int r, int c,boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1) {
            System.out.println(p);
            return;
        }
        //for obstruction
        if(!maze[r][c]){
            return;
        }
        //for moving down
        if(r<maze.length-1) {
            printAllPaths(p + "D", r + 1, c,maze);
        }
        //for moving right
        if (c <maze[0].length-1) {
            printAllPaths(p+"R",r,c+1,maze);
        }
        //for moving up
        if(r>0){
            printAllPaths(p+"U",r-1,c,maze);
        }
        if(c>0){
            printAllPaths(p+"L",r,c-1,maze);
        }

    }

    //One Solution is to mark the visited location as false
    //i.e. we can use backtracking , we mark all the cell false we visit , but after returning call is poping from the stack we have tp revert the changes i.e. we have to backtrack
    public static void printAllPaths2(String p,int r, int c,boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1) {
            System.out.println(p);
            return;
        }
        //for obstruction
        if(!maze[r][c]){
            return;
        }
        //at every call , we are making the current step as false
        //Node pre
        maze[r][c]=false;

        //for moving down
        if(r<maze.length-1) {
            printAllPaths2(p + "D", r + 1, c,maze);
        }
        //for moving right
        if (c <maze[0].length-1) {
            printAllPaths2(p+"R",r,c+1,maze);
        }
        //for moving up
        if(r>0){
            printAllPaths2(p+"U",r-1,c,maze);
        }
        //for moving left
        if(c>0){
            printAllPaths2(p+"L",r,c-1,maze);
        }


        //if I reach here , it means i am out of the recursive call , I have to backtrack
        //Node post
        maze[r][c]=true;
    }


    //now suppose we also want to print the matrix along with the path
    //for this: i have to maintain an additional matrix which will store the path and an additional step variable which will determine at which level we are currently at
    public static void printAllPaths3(String p,int r, int c,boolean[][] maze,int[][] path,int steps){
        if(r==maze.length-1 && c==maze[0].length-1) {
            path[r][c]=steps;
            for (int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        //for obstruction
        if(!maze[r][c]){
            return;
        }
        //at every call , we are making the current step as false
        maze[r][c]=false;
        path[r][c]=steps;

        //for moving down
        if(r<maze.length-1) {
            printAllPaths3(p + "D", r + 1, c,maze,path,steps+1);
        }
        //for moving right
        if (c <maze[0].length-1) {
            printAllPaths3(p+"R",r,c+1,maze,path,steps+1);
        }
        //for moving up
        if(r>0){
            printAllPaths3(p+"U",r-1,c,maze,path,steps+1);
        }
        //for moving left
        if(c>0){
            printAllPaths3(p+"L",r,c-1,maze,path,steps+1);
        }
        //if I reach here , it means i am out of the recursive call , I have to backtrack
        maze[r][c]=true;
        //we also have to revert the update in our path array
        path[r][c]=0;
    }
    public static ArrayList<ArrayList<String>> findAllPathsArray(boolean[][] maze) {
        int rows = maze.length;
        int cols = maze[0].length;
        ArrayList<ArrayList<String>> allPaths = new ArrayList<>();
        ArrayList<String> currentPath = new ArrayList<>();
        printAllPaths2(allPaths, currentPath, 0, 0, maze);
        return allPaths;
    }

    public static void printAllPaths2(ArrayList<ArrayList<String>> allPaths, ArrayList<String> currentPath, int r, int c, boolean[][] maze){
        int rows = maze.length;
        int cols = maze[0].length;

        if(r == rows-1 && c == cols-1) {
            // Destination reached, add current path to all paths
            allPaths.add(new ArrayList<>(currentPath));
            return;
        }

        // Check for obstruction
        if(!maze[r][c]){
            return;
        }

        // Mark current cell as visited
        maze[r][c] = false;

        // Move down
        if(r < rows-1) {
            currentPath.add("D");
            printAllPaths2(allPaths, currentPath, r + 1, c, maze);
            currentPath.remove(currentPath.size()-1); // Backtrack
        }

        // Move right
        if (c < cols-1) {
            currentPath.add("R");
            printAllPaths2(allPaths, currentPath, r, c + 1, maze);
            currentPath.remove(currentPath.size()-1); // Backtrack
        }

        // Move up
        if(r > 0){
            currentPath.add("U");
            printAllPaths2(allPaths, currentPath, r - 1, c, maze);
            currentPath.remove(currentPath.size()-1); // Backtrack
        }

        // Move left
        if(c > 0){
            currentPath.add("L");
            printAllPaths2(allPaths, currentPath, r, c - 1, maze);
            currentPath.remove(currentPath.size()-1); // Backtrack
        }

        // Mark current cell as unvisited (backtrack)
        maze[r][c] = true;
    }


}
