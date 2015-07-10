package daniel.bai.leetcode;

import daniel.bai.leetcode.util.ListNode;

public class RemoveDuplicatesFromSortedList {
	/*
	 * LeetCode No. 83
	 * Remove Duplicates from Sorted List
	 * @author Daniel Bai
	 */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode current = new ListNode(1);
        current.next = head;
        current = current.next;
        while(current.next!= null){
            if(current.next.val == current.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }
}
