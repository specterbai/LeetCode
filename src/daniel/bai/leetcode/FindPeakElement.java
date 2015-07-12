package daniel.bai.leetcode;

public class FindPeakElement {
	/*
	 * LeetCode No. 162
	 * Find Peak Element
	 * @author Daniel Bai
	 */
	public int findPeakElement(int[] nums){
		return findPeakElement(nums, 0, nums.length-1);
	}
	public int findPeakElement(int[] nums, int s, int e){
		if(s == e)
			return s;
		if(e - s == 1)
			return nums[s] > nums[e] ? s : e;
		int mid = (s + e) / 2;
		if(nums[mid] < nums[mid+1])
			return findPeakElement(nums, mid, e);
		else
			return findPeakElement(nums, s, mid);
	}
}
