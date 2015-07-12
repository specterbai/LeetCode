package daniel.bai.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RotateArray {
	/*
	 * LeetCode No. 189
	 * Rotate Array
	 * @author Daniel Bai
	 */
	public void rotate(int[] nums, int k){
		if(nums.length < 1)
			return;
		k = k%nums.length;
		if(k == 0)
			return;
		Queue<Integer> tmp = new LinkedList<Integer>();
		for(int i = nums.length-k; i < nums.length; i ++){
			tmp.add(nums[i]);
		}
		for(int i = nums.length-1; i >= k ; i --){
			nums[i] = nums[i-k];
		}
		for(int i = 0; i < k; i ++){
			nums[i] = tmp.poll();
		}
	}
	
	public static void main(String args[]){
		int[] nums = {1,2,3};
		RotateArray ra = new RotateArray();
		ra.rotate(nums, 1);
	}
}
