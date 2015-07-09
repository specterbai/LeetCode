package daniel.bai.leetcode;

public class MaximumProductSubarray {
	
	/*
	 * LeetCode No. 152
	 * Maximum Product Subarray
	 * @author Daniel Bai
	 */
	
	public int maxProduct(int[] nums){
		if(nums.length < 1)
			return 0;
		if(nums.length == 1)
		    return nums[0];
		int result = nums[0];
		int cur = 1;
		int neg = 1;
		for(int i = 0; i < nums.length; i ++){
			if(nums[i] != 0){
				cur *= nums[i];
				result = Math.max(result, nums[i]);
				result = Math.max(result, cur);
				if(cur < 0 && neg > 0){
					neg = cur;
				}
			} else {
				result = Math.max(result, 0);
				if(cur < 0){
					cur /= neg;
					if(cur != 1)
						result = Math.max(result, cur);
				}
				if(i < nums.length - 1){
					cur = 1;
					neg = 1;
				}
			}

		}
		cur /= neg;
		if(cur != 1)
			result = Math.max(result, cur);
		return result;
	}
}
