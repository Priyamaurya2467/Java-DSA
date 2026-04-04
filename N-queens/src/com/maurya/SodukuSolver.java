package com.maurya;

public class SodukuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solve(board)){
            display(board,row,col, num);
        }else {
            System.out.println("No Solution");
        };

    }


    static boolean solve(int[][] board  ) {
        int n =  board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        //this is how we are replacing the r, c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you found some empty element in row , then break
            if(emptyLeft == false){
                break;
            }

        }
        if(emptyLeft == true){
            //found the answer
            display(board);
            return true;

            //soduko is solved
        }

        //backtrack
        for (int number = 1; number <= 9; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    //found the answer
                    display();
                    return true;
                }
                else{
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    private static void display(int[][] board, int row, int col, int number){}
    }
    static boolean isSafe(int[][] board , int row , int col , int number) {
        //check the row
        for(int i = 0 ; i < board.length ; i++) {
            //check if the number is in the row
            if(board[row][col] == number){
                return false;
            }
        }
        //check the col
        for(int[] nums : board) {
            //check if the number is in the col
            if(nums[col] == number){
                return false;
            }
        }
        //square matrix
        int sqrt =  (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int r = rowStart; r < rowStart + sqrt; r++){
            for(int c = colStart; c < colStart + sqrt; c++){
                if(board[r][c] == number){
                    return false;
                }
            }
        }
        return true;
    }
}
