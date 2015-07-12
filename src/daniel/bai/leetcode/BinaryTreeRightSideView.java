package daniel.bai.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import daniel.bai.leetcode.util.TreeNode;

public class BinaryTreeRightSideView {
	/*
	 * LeetCode No. 199
	 * Binary TreeRight Side View
	 * @author Daniel Bai
	 */
	public List<Integer> rightSideView(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		if(root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int remain = 1;
		int next = 0;
		while(queue.size() > 0){
			TreeNode tmp = queue.poll();
			remain --;
			if(tmp.left != null){
				next ++;
				queue.offer(tmp.left);
			}
			if(tmp.right != null){
				next ++;
				queue.offer(tmp.right);
			}
			if(remain == 0){
				result.add(tmp.val);
				remain = next;
				next = 0;
			}
			
		}
		return result;
	}
	
}
