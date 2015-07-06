package daniel.bai.leetcode;

public class NumberOfOneBits {
	/*
	 * LeetCode No. 191 Number of 1 Bits
	 * 
	 * @author Daniel Bai
	 */

	public int hammingWeight(int n) {
		int val = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & 1) == 1) {
				val++;
			}
			n = n >> 1;
		}
		return val;
	}
}
