package daniel.bai.leetcode;

import daniel.bai.leetcode.util.TreeNode;

public class MaximumDepthOfBinaryTree {
	/*
	 * LeetCode No. 104
	 * Maximum Depth of Binary Tree
	 * @author Daniel Bai
	 */
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}
}
