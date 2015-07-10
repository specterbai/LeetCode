package daniel.bai.leetcode;

import daniel.bai.leetcode.util.TreeNode;

public class InvertBinaryTree {
	/*
	 * LeetCode No. 226
	 * Invert Binary Tree
	 * @author Daniel Bai
	 */
    public TreeNode invertTree(TreeNode root) {
        revert(root);
        return root;
    }
    public void revert(TreeNode root){
        if(root == null)
            return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        revert(root.left);
        revert(root.right);
    }
}
