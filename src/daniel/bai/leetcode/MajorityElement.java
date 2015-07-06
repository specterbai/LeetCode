package daniel.bai.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
	/*
	 * LeetCode No. 169
	 * Majority Element
	 * @author Daniel Bai
	 */
	public int majorityElement(int[] nums){
		int candidate = 0;
		int count = 0;
		
		for(int i : nums){
			if(candidate == i){
				count++;
			} else if(count == 0){
				candidate = i;
				count++;
			} else {
				count--;
			}
		}
		count = 0;
		for(int i : nums){
			if(i == candidate){
				count++;
			}
		}
		if(count > nums.length/2){
			return candidate;
		}
		return 0;
	}
}
