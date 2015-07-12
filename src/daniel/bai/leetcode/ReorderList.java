package daniel.bai.leetcode;

import java.util.Deque;
import java.util.LinkedList;

import daniel.bai.leetcode.util.ListNode;

public class ReorderList {
	/*
	 * LeetCode No. 143
	 * Reorder List
	 * @author Daniel Bai
	 */
	public void reorderList(ListNode head){
		Deque<ListNode> deque = new LinkedList<ListNode>();
		ListNode current = new ListNode(0);
		current.next = head;
		while(current.next != null){
			deque.addLast(current.next);
			current.next = current.next.next;
		}
		current.next = head;
		while(deque.size() > 0){
			current.next = deque.pollFirst();
			current = current.next;
			if(deque.size() > 0){
				current.next = deque.pollLast();
				current = current.next;
			}
		}
		current.next = null;
	}
	public static void main(String args[]){
		ReorderList rl = new ReorderList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		rl.reorderList(head);
	}
}
