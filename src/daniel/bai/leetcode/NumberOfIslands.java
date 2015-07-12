package daniel.bai.leetcode;

public class NumberOfIslands {
	/*
	 * LeetCode No. 200
	 * Number of Islands
	 * @author Daniel Bai
	 */
	public int numIslands(char[][] grid){
		if(grid.length == 0)
			return 0;
		int height = grid.length;
		int width = grid[0].length;
		boolean[][] visited = new boolean[height][width];
		int result = 0;
		for(int i = 0; i < height; i ++){
			for(int j = 0; j < width; j ++){
				if(grid[i][j] == 48 || visited[i][j] == true){
					visited[i][j] = true;
					continue;
				} else {
					check(i, j, grid, visited);
					result++;
				}
			}
		}
		return result;
	}
	
	public void check(int i, int j, char[][] grid, boolean[][] visited){
		visited[i][j] = true;
		if(grid[i][j] == 48)
			return;
		if(i > 0 && !visited[i-1][j]){
			check(i-1, j, grid, visited);
		}
		if(i < grid.length-1 && !visited[i+1][j]){
			check(i+1, j, grid, visited);
		}
		if(j > 0 && !visited[i][j-1]){
			check(i, j-1, grid, visited);
		}
		if(j < grid[0].length-1 && !visited[i][j+1]){
			check(i, j+1, grid, visited);
		}
	}
}
