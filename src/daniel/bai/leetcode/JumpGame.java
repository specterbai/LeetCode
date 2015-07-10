package daniel.bai.leetcode;

public class JumpGame {
	/*
	 * LeetCode No. 55
	 * Jump Game
	 * @author Daniel Bai
	 */
    public boolean canJump(int[] nums) {
        int max = 1;
        for(int i = 0; i < nums.length; i ++){
            max--;
            max = Math.max(max, nums[i]);
            if(max == 0 && i != nums.length-1)
                return false;
        }
        return true;
    }
}
