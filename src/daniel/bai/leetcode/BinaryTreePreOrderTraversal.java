package daniel.bai.leetcode;

import java.util.ArrayList;
import java.util.List;

import daniel.bai.leetcode.util.TreeNode;

public class BinaryTreePreOrderTraversal {
	/*
	 * LeetCode No. 144
	 * Binary Tree Pre Order Traversal
	 * @author Daniel Bai
	 */
	public List<Integer> preorderTraversal(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		preorderTraverse(root, result);
		return result;
	}
	
	public void preorderTraverse(TreeNode root, List<Integer> result){
		if(root == null){
			return;
		}
		result.add(root.val);
		preorderTraverse(root.left, result);
		preorderTraverse(root.right, result);
	}
}
