package daniel.bai.leetcode;

import daniel.bai.leetcode.util.ListNode;

public class LinkedListCycle {
	/*
	 * LeetCode No. 141
	 * Linked List Cycle
	 * @author Daniel Bai
	 */
	public boolean hasCycle(ListNode head){
		ListNode s1 = new ListNode(1);
		ListNode s2 = new ListNode(2);
		s1.next = head;
		s2.next = head;
		if(s2.next == null || s2.next.next == null)
			return false;	
		while(s2.next.next != null && s2.next.next.next != null){
			s1.next = s1.next.next;
			s2.next = s2.next.next.next;
			if(s1.next == s2.next)
				return true;
		}
		return false;
	}
}
