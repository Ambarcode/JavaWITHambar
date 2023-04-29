package com.ak.Backtracking;

import javax.swing.*;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board={ { 3, 1, 6, 5, 7, 8, 4, 9, 2 },
                { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
                { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
                { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
                { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
                { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
                { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
                { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
                { 7, 4, 5, 0, 8, 6, 3, 1, 0 } };

        if (sudoku(board))
            display(board);
    }

    public static boolean sudoku(int[][]board){
        int r=-1;
        int c=-1;
        boolean emptyLeft=true;
        for (int i= 0; i < board.length;i++) {
            for (int j=0;j<board[0].length;j++) {
                if (board[i][j] == 0) {
                    r=i;
                    c=j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) break;
        }

        if(emptyLeft) return true; //it means that the sudoku is solved

            for (int i = 0; i <=9 ; i++) {
                if(isSafe(board , r,c,i)) {
                    board[r][c] = i;
                    if (sudoku(board)) {
                        //found the answer
                        return true;
                    }
                    else{
                        //backtrack
                        board[r][c]=0;
                    }
                }
            }
            return false;
        }

    private static void display(int[][] board) {
        for (int[] nums: board) {
            for (int num:nums ) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }


    public static boolean isSafe(int[][] board, int row, int col , int num){
        //checking for row
        for (int j = 0; j < board[0].length ; j++) {
                  if(board[row][j]==num) return false;
            }
        //checking for column
        for (int[] ints : board) {
            if (ints[col] == num) {
                return false;
            }
        }

        //now , the most important one , i.e. submatrix one
        int sqrt=(int)(Math.sqrt(board.length));
        int stRow=row-row%sqrt;
        int stCol=col-col%sqrt;

        for (int i = stRow; i <stRow+sqrt ; i++) {
            for (int j = stCol; j < stCol+sqrt; j++) {
                if (board[i][j]==num) return false;
            }

        }
        return true;
        }
    }

