package com.ak.Backtracking;

public class NKnight {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board =new boolean[n][n];
        knights(board,0,0,n);
    }
    public static void knights(boolean[][] board , int row , int col , int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1 && col==board[0].length){
            return;
        }

       if(col==board[0].length){
           knights(board,row+1, 0,knights);
           return;
       }
       if(isSafe(board, row , col ,knights)){
           board[row][col]=true;
           knights(board,row,col+1,knights-1);
           board[row][col]=false;
       }
       knights(board,row,col+1,knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col, int knights) {
        //here there can exist four checks only

        //upper L movement in left
        if(isValid(board, row-2,col-1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        //upper L movement in right
        if(isValid(board, row-2,col+1)){
                if (board[row-2][col+1]){
                    return false;
                }
        }
        //L movement in left
        if (isValid(board, row-1, col-2)){
            if (board[row-1][col-2]){
                return false;
            }
        }
        // L movement in right
        if (isValid(board, row-1, col+2)){
            if (board[row-1][col+2]){
                return false;
            }
        }
            return true;
    }

    private static boolean isValid(boolean[][] board , int row , int col){
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }
    private static void display(boolean[][] board) {
        for (boolean[] row: board){
            for (boolean element : row){
                if(element){
                    System.out.print("K");
                }else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
