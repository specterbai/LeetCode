package daniel.bai.leetcode;

public class WordSearch {
	/*
	 * LeetCode No. 79
	 * Word Search
	 * @author Daniel Bai
	 */
	
	public boolean exist(char[][] board, String word){
		boolean[][] visited = new boolean[board.length][board[0].length];
		for(int i = 0; i < board.length; i ++){
			for(int j = 0; j < board[0].length; j ++){
				if(search(board, visited, i, j, 0, word))
					return true;
			}
		}
		return false;
	}
	
	public boolean search(char[][] board, boolean[][] visited, int x, int y, int index, String word){
		if(index >= word.length())
			return true;
		if (x < 0 || x >= board.length || y < 0 || y >= board[0].length)
			return false;
		if(visited[x][y])
			return false;
		if(board[x][y] != word.charAt(index))
			return false;
		visited[x][y] = true;
		if(search(board, visited, x+1, y, index+1, word) || search(board, visited, x, y+1, index+1, word)
				|| search(board, visited, x-1, y, index+1, word) || search(board, visited, x, y-1, index+1, word))
			return true;
		visited[x][y] = false;
		return false;
	}
}
