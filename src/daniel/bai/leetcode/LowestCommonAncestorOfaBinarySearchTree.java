package daniel.bai.leetcode;

import daniel.bai.leetcode.util.TreeNode;

public class LowestCommonAncestorOfaBinarySearchTree {
	/*
	 * LeetCode No. 235
	 * Lowest Common Ancestor of a Binary Search Tree
	 * @author Daniel Bai
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
		if(p.val == q.val)
			return p;
		if(root.val == p.val || root.val == q.val)
			return root;
		if(getRootLocation(root, p, q) < 2)
			return lowestCommonAncestor(root.left, p, q);
		else if(getRootLocation(root, p, q) > 2)
			return lowestCommonAncestor(root.right, p, q);
		else
			return root;
	}
	public int getRootLocation(TreeNode root, TreeNode p, TreeNode q){
		if(root.val < Math.min(p.val, q.val))
			return 3;
		else if(root.val > Math.max(p.val, q.val))
			return 1;
		else
			return 2;
	}
	
	public static void main(String args[]){
		LowestCommonAncestorOfaBinarySearchTree l = new LowestCommonAncestorOfaBinarySearchTree();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.left.left.left = new TreeNode(1);
		System.out.println(l.lowestCommonAncestor(root, root.left.left.left, root.left.right).val);
	}
}
