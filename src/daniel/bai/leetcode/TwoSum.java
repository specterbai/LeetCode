package daniel.bai.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/*
	 * LeetCode No. 1
	 * Two Sum
	 * @author Daniel Bai
	 */
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				int t = map.get(target - nums[i]);
				if (t != i) {
					res[0] = i+1;
					res[1] = map.get(target - nums[i]) + 1;
					return res;
				}
			}
		}
		return res;
	}
}
