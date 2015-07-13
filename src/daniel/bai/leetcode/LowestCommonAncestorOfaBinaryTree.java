package daniel.bai.leetcode;

import java.util.ArrayList;
import java.util.List;

import daniel.bai.leetcode.util.TreeNode;

public class LowestCommonAncestorOfaBinaryTree {
	/*
	 * LeetCode No. 236
	 * Lowest Common Ancestor Of a Binary Tree
	 * @author Daniel Bai
	 */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if(root == null || root == p || root == q)
    		return root;
        List<Integer> node1 = new ArrayList<Integer>();
        List<Integer> node2 = new ArrayList<Integer>();
        node1.add(1);
        node2.add(1);
        findNode(root, p, node1);
        findNode(root, q, node2);
        int cnt = 0;
        while(cnt < Math.min(node1.size(), node2.size()) && node1.get(cnt) == node2.get(cnt)){
        	cnt++;
        }
        TreeNode result = new TreeNode(2);
        result.left = root;
        for(int i = 0; i < cnt; i ++){
        	result = node1.get(i) == 1 ? result.left : result.right;
        }
        return result;
    }
    public boolean findNode(TreeNode root, TreeNode t, List<Integer> result){
    	if(root == null)
    		return false;
        if(root == t)
            return true;
        result.add(1);
        if(findNode(root.left, t, result))
            return true;
        result.remove(result.size()-1);
        result.add(2);
        if(findNode(root.right, t, result))
            return true;
        result.remove(result.size()-1);
        return false;
    }
    
    public static void main(String args[]){
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.right = new TreeNode(3);
    	root.left.left = new TreeNode(4);
    	root.left.right = new TreeNode(5);
    	root.right.left = new TreeNode(6);
    	root.right.right = new TreeNode(7);
    	root.left.left.left = new TreeNode(8);
    	root.right.left.right = new TreeNode(9);
    	root.left.left.left.right = new TreeNode(10);
    	LowestCommonAncestorOfaBinaryTree lc = new LowestCommonAncestorOfaBinaryTree();
    	System.out.println(lc.lowestCommonAncestor(root, root.left.left, root.left.left.left).val);
    }
}
