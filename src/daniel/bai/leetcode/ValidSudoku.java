package daniel.bai.leetcode;

public class ValidSudoku {
	/*
	 * LeetCode No. 36
	 * Valid Sudoku
	 * @author Daniel Bai
	 */
	
	public boolean isValidSudoku(char[][] board){
		for(int i = 0; i < 9; i ++){
			for(int j = 0; j < 9; j ++){
				if(!isValid(i, j, board))
					return false;
			}
		}
		return true;
	}
	private boolean isValid(int x, int y, char[][] board){
		if(board[x][y] == '.')
			return true;
		for(int i = 0; i < 9; i ++){
			if(board[i][y] == board[x][y] && i != x)
				return false;
			if(board[x][i] == board[x][y] && i != y)
				return false;
		}
		for(int i = 0; i < 3; i ++){
			for(int j = 0; j < 3; j ++){
				int xx = x/3*3 + i;
				int yy = y/3*3 + j;
				if(board[xx][yy] == board[x][y] && (xx != x && yy != y))
					return false;
			}
		}
		return true;
	}
}
