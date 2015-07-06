package daniel.bai.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
	/*
	 * LeetCode No. 229
	 * Majority Element II
	 * @author Daniel Bai
	 */
	public List<Integer> majorityElement(int[] nums){
		int candidate1 = 0;
		int candidate2 = 0;
		int count1 = 0;
		int count2 = 0;
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i : nums){
			if(candidate1 == i){
				count1++;
			} else if(candidate2 == i) {
				count2++;
			} else if(count1 == 0){
				candidate1 = i;
				count1++;
			} else if(count2 == 0){
				candidate2 = i;
				count2++;
			} else {
				count1--;
				count2--;
			}
		}
		count1 = count2 = 0;
		for(int i : nums){
			if(i == candidate1){
				count1++;
			}
			if(i == candidate2){
				count2++;
			}
		}
		if(count1 > nums.length/3){
			result.add(candidate1);
		}
		if(count2 > nums.length/3){
			result.add(candidate2);
		}
		return result;
	}
}
