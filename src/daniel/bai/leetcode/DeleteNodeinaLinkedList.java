package daniel.bai.leetcode;

import daniel.bai.leetcode.util.ListNode;

public class DeleteNodeinaLinkedList {
	/*
	 * LeetCode No. 237
	 * Delete Node in a Linked List
	 * @author Daniel Bai
	 */
	public void deleteNode(ListNode node){
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
