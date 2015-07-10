package daniel.bai.leetcode;

public class SortColors {
	/*
	 * LeetCode No. 75
	 * Sort Colors
	 * @author Daniel Bai
	 */
	public void sortColors(int[] nums){
		int red = 0;
		int white = 0;
		for(int i : nums){
			if(i == 0){
				red ++;
			} else if(i == 1){
				white ++;
			}
		}
		for(int i = 0; i < red; i ++){
			nums[i] = 0;
		}
		for(int i = red; i < red + white; i ++){
			nums[i] = 1;
		}
		for(int i = red + white; i < nums.length; i ++){
			nums[i] = 2;
		}
	}
}
