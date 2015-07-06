package daniel.bai.leetcode;

import daniel.bai.leetcode.util.TreeNode;

public class KthSmallestElementinaBST {
	/*
	 * LeetCode No. 230
	 * Kth Smallest Element in a BST
	 * @author Daniel Bai
	 */
	public int kthSmallest(TreeNode root, int k) {
		if (root == null) {
			return 0;
		}
		int left = countTree(root.left);
		if (k - left == 1) {
			return root.val;
		}
		if (k > left) {
			return kthSmallest(root.right, k - left);
		} else {
			return kthSmallest(root.left, k);
		}
	}

	private int countTree(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return countTree(root.left) + countTree(root.right) + 1;
		}
	}
}
