package daniel.bai.leetcode;

import daniel.bai.leetcode.util.ListNode;

public class LinkedListCycleII {
	/*
	 * LeetCode No. 142
	 * Linked List Cycle II
	 * @author Daniel Bai
	 */
	public ListNode detectCycle(ListNode head){
		ListNode s1 = new ListNode(1);
		ListNode s2 = new ListNode(2);
		s1.next = head;
		s2.next = head;
		if(s2.next == null || s2.next.next == null)
			return null;	
		while(s2.next.next != null && s2.next.next.next != null){
			s1.next = s1.next.next;
			s2.next = s2.next.next.next;
			if(s1.next == s2.next)
				break;
		}
		if(s2.next.next == null || s2.next.next.next == null)
			return null;
		s2.next = head;
		while(s1.next != s2.next){
			s2.next = s2.next.next;
			s1.next = s1.next.next;
		}
		return s1.next;
	}
}
