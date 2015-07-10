package daniel.bai.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	/*
	 * LeetCode No. 228
	 * Summary Ranges
	 * @author Daniel Bai
	 */
	public List<String> summaryRanges(int[] nums){
		List<String> list = new ArrayList<String>();
		if(nums.length < 1)
			return list;		
		int start = nums[0];
		int current = nums[0]+1;
		for(int i = 1; i < nums.length; i ++){
			if(nums[i] != current){
				list.add(getString(start, current-1));
				current = nums[i] + 1;
				start = nums[i];
			} else {
				current++;
			}
		}
		list.add(getString(start, current-1));
		return list;
	}
	
	public String getString(int s, int e){
		if(e == s)
			return String.valueOf(s);
		return String.valueOf(s) + "->" + String.valueOf(e);
	}
}
