package daniel.bai.leetcode;

public class NimGame {
	/**
	 * LeetCode No. 292
	 * Nim Game
	 * @author miaobai
	 */
	
	public boolean canWinNim(int n){
		return !(n % 4 == 0);
	}
}
