package daniel.bai.leetcode;

public class FactorialTrailingZeroes {
	/*
	 * LeetCode No. 172
	 * Factorial Trailing Zeroes
	 * @author Daniel Bai
	 */
	public int trailingZeroes(int n){
		long base = 5;
		int result = 0;
		while(n/base > 0){
			result += n/base;
			base *= 5;
		}
		return result;
	}
}
