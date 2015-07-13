package daniel.bai.leetcode;

import daniel.bai.leetcode.util.TreeNode;

public class PathSum {
	/*
	 * LeetCode No. 112
	 * Path Sum
	 * @author Daniel Bai
	 */
	public boolean hasPathSum(TreeNode root, int sum){
        if(root == null)
			return false;
		sum -= root.val;
		if(root.left == null && root.right == null)
		    return sum == 0;
		return hasPathSum(root.left, sum) | hasPathSum(root.right, sum);
	}
}
