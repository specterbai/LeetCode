package daniel.bai.leetcode;

public class ReverseBits {
	/*
	 * LeetCode No. 190
	 * Reverse Bits
	 * @author Daniel Bai
	 */
	public int reverseBits(int n){
		int result = 0;
		for(int i = 0; i < 32; i ++){
			result = result << 1;
			result = result | (n & 1);
			n = n >>> 1;
		}
		return result;
	}
}
