package daniel.bai.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
	/*
	 * LeetCode No. 239
	 * Sliding Window Maximum
	 * @author Daniel Bai
	 */
	
	public int[] maxSlidingWindow(int[] nums, int k) {
		int[] result = new int[nums.length-k+1];
		Deque<Integer> deque = new LinkedList<Integer>();
		Deque<Integer> index = new LinkedList<Integer>();
		for(int i = 0; i < k; i ++){
			addElement(deque, index, nums[i], i);
		}
		for(int i = k; i < nums.length; i ++){
			result[i-k] = deque.peekFirst();
			if(index.peekFirst() + k == i){
				deque.pollFirst();
				index.pollFirst();
			}
			addElement(deque, index, nums[i], i);
		}
		result[result.length-1] = deque.pollFirst();
		return result;
	}
	
	public void addElement(Deque<Integer> deque, Deque<Integer> index, int val, int i){
		if(deque.size() == 0){
			deque.addLast(val);
			index.addLast(i);
		} else {
			while(deque.size() > 0 && deque.peekLast() < val){
				deque.pollLast();
				index.pollLast();
			}
			deque.addLast(val);
			index.addLast(i);
		}
	}
}
