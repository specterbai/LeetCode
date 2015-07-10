package daniel.bai.leetcode;

import java.util.ArrayList;
import java.util.List;

public class JumpGameII {
	/*
	 * LeetCode No. 45
	 * Jump Game II
	 * @author Daniel Bai
	 */
	public int jump(int[] nums){
		if(nums.length < 2)
			return 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(nums[0]);
		if(nums[0] >= nums.length-1)
			return 1;
		int current = 1;
		for(int i = 1; i < nums.length; i ++){
			if(i > list.get(current)){
				current++;
			}
			if(list.size() < current + 2){
				int far = i + nums[i];
				if(far >= nums.length-1)
					return current+1;
				list.add(far);
			} else {
				int far = Math.max(list.get(current+1), i + nums[i]);
				if(far >= nums.length-1)
					return current+1;
				list.set(current+1, far);
			}
		}
		return list.size()-1;
	}
	
	public static void main(String args[]){
		JumpGameII jg = new JumpGameII();
		int[] nums = {1,2,3};
		System.out.println(jg.jump(nums));
	}
}
