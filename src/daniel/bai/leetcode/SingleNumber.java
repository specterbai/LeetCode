package daniel.bai.leetcode;

public class SingleNumber {
	/*
	 * LeetCode No. 136
	 * Single Number
	 * @author Daniel Bai
	 */
	public int singleNumber(int[] nums){
        int result = 0;
        for(int i : nums){
            result = result ^ i;
        }
        return result;
	}
}
