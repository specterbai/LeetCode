package daniel.bai.leetcode;

import java.util.ArrayList;
import java.util.List;

import daniel.bai.leetcode.util.TreeNode;

public class BinaryTreeInorderTraversal {
	/*
	 * LeetCode No. 94 
	 * Binary Tree Inorder Traversal
	 * @author Daniel Bai
	 */
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		inorderTraverse(root, result);
		return result;
	}

	public void inorderTraverse(TreeNode root, List<Integer> result) {
		if (root == null)
			return;
		inorderTraverse(root.left, result);
		result.add(root.val);
		inorderTraverse(root.right, result);
	}
}
