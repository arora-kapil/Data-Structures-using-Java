package stack;
//https://www.codingninjas.com/studio/problems/sudoku-solver_699919?leftPanelTab=1&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar
public class sudoku {

}

import java.util.* ;
import java.io.*; 
public class Solution {
    
	public static void solveSudoku(int[][] sudoku) {
        // Write your code here.
		solve(sudoku);
	}

	public static boolean solve(int[][] board) {
		int n = board[0].length;

		for(int row = 0 ; row < n ; row ++) {
			for(int col = 0 ; col < n ; col++) {
				if(board[row][col] == 0) {
					for(int val = 1 ; val <= 9 ; val++) {
						if(isSafe(row, col, board, val)) {
							board[row][col] = val;

							boolean ifPossible = solve(board);
							if(ifPossible) {
								return true;
							}
							else {
								//backtrack
								board[row][col] = 0;
							}
						}
					}

					return false;
				}
			}
		}

		return true;
	}

	public static boolean isSafe(int row, int col, int[][] board, int val) {
		for(int i = 0 ; i < 9 ; i++) {
			//row check
			if(board[row][i] == val) {
				return false;
			}

			//col check
			if(board[i][col] == val) {
				return false;
			}

			//grid check
			if(board[3*(row/3) + i/3][3*(col/3) + i%3] == val) {
				return false;
			}
		}

		return true;
	}
}
