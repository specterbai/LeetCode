package daniel.bai.leetcode;

public class RemoveDuplicatesFromSortedArray {
	/*
	 * LeetCode No. 26
	 * Remove Duplicates From Sorted Array
	 * @author Daniel Bai
	 */
	public int removeDuplicates(int[] nums) {
		if(nums.length < 1)
			return 0;
		int valid = 1;
		for(int i = 1; i < nums.length; i ++){
			if(nums[i] == nums[valid-1]){
				continue;
			} else {
				nums[valid] = nums[i];
				valid++;
			}
		}
		return valid;
	}
}