package daniel.bai.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import daniel.bai.leetcode.util.ListNode;

public class PalindromeLinkedList {
	/*
	 * LeetCode No. 234
	 * Palindrome Linked List
	 * @author Daniel Bai
	 */
	public boolean isPalindrome(ListNode head){
		ListNode current = new ListNode(0);
		current.next = head;
		int count = 0;
		while(current.next != null){
			count++;
			current = current.next;
		}
		if(count < 2)
			return true;
		if(count == 2)
			return head.val == head.next.val;
		if(count == 3)
			return head.val == head.next.next.val;
		Queue<ListNode> queue = new LinkedList<ListNode>();
		current.next = head;
		for(int i = 0; i < count/2; i ++){
			queue.add(current.next);
			current = current.next;
			if(queue.size() > 2){
				ListNode tmp = queue.poll();
				queue.peek().next = tmp;
			}
		}
		current = current.next;
		ListNode tmp = queue.poll();
		queue.peek().next = tmp;
		ListNode fl = new ListNode(1);
		ListNode fr = new ListNode(2);
		fl.next = queue.peek();
		if(count%2 == 1)
			fr.next = current.next;
		else
			fr.next = current;
		for(int i = 0; i < count/2; i ++){
			if(fl.next.val != fr.next.val)
				return false;
			fl = fl.next;
			fr = fr.next;
		}
		
		return true;
	}
}
