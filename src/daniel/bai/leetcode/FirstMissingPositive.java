package daniel.bai.leetcode;

public class FirstMissingPositive {
	/*
	 * LeetCode No. 41 
	 * First Missing Positive
	 * @author Daniel Bai
	 */
	public int firstMissingPositive(int[] nums) {
		int[] result = new int[nums.length + 1];
		result[0] = 1;
		for (int i : nums) {
			if (i > 0) {
				if (i < result.length) {
					result[i] = 1;
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0)
				return i;
		}
		return nums.length + 1;
	}
}
