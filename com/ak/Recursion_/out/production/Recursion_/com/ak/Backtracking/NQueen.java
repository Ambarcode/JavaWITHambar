package com.ak.Backtracking;

public class NQueen {
    public static void main(String[] args) {
        int n=5;
        int[][] chess=new int[n][n];
        printNQueen(chess, "",0);
        boolean[][] board =new boolean[n][n];
        queens(board,0);
    }

    //queen so far
    private static void printNQueen(int[][] chess, String qsf, int row) {
        if(row==chess.length){
            System.out.println(qsf);
            return;
        }

        for(int col=0;col<chess.length;col++){
            if(isItSafeForQueen(chess, row, col)) {
                chess[row][col] = 1;
                printNQueen(chess, qsf + row + "-" + col + " , ", row + 1);
                chess[row][col] = 0;
            }
        }
    }


    public static boolean isItSafeForQueen(int[][] chess, int row, int col) {

        //for upward check
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        //for right diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        //for left diagonal
        for (int i = row - 1, j = col + 1; i >= 0
                && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
    
    //Now referring to kunal 
    
    static void queens(boolean[][] board , int row){
        if(row==board.length) {
            display(board);
            System.out.println();
            return ;
        }
        //placing the queen and checking for every row and column
        for(int col=0;col<board.length;col++){
            //place the queen , if it is safe
            if(isSafe(board , row, col)){
                board[row][col]=true;
                queens(board, row+1);
                board[row][col]=false;
            }
        }

    }

    private static void display(boolean[][] board) {
        for (boolean[] row: board){
            for (boolean element : row){
                if(element){
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }

            }
            System.out.println();


        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //for upward check
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (board[i][j]) {
                return false;
            }
        }

        //for right diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        //for left diagonal
        for (int i = row - 1, j = col + 1; i >= 0
                && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }


}
