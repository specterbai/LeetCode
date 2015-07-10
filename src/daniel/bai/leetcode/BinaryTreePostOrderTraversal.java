package daniel.bai.leetcode;

import java.util.ArrayList;
import java.util.List;

import daniel.bai.leetcode.util.TreeNode;

public class BinaryTreePostOrderTraversal {
	/*
	 * LeetCode No. 145
	 * Binary Tree Post Order Traversal
	 * @author Daniel Bai
	 */
	
	public List<Integer> postorderTraversal(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		postorderTraverse(root, result);
		return result;
	}
	
	public void postorderTraverse(TreeNode root, List<Integer> result){
		if(root == null){
			return;
		}
		postorderTraverse(root.left, result);
		postorderTraverse(root.right, result);
		result.add(root.val);
	}
}
