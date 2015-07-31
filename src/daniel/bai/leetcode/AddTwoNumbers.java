package daniel.bai.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import daniel.bai.leetcode.util.ListNode;

public class AddTwoNumbers {
	/*
	 * LeetCode No. 2
	 * Add Two Numbers
	 * @author Daniel Bai
	 */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> queue1  = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();
        while(l1 != null){
            queue1.offer(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            queue2.offer(l2.val);
            l2 = l2.next;
        }
        int extra = 0;
        ListNode start = new ListNode(0);
        ListNode head = new ListNode(0);
        while(queue1.size() + queue2.size() > 0){
            int a = queue1.size() == 0 ? 0 : queue1.poll();
            int b = queue2.size() == 0 ? 0 : queue2.poll();
            int result = a+b+extra;
            extra = result >= 10 ? 1 : 0;
            ListNode tmp = new ListNode(result%10);
            start.next = tmp;
            if(head.next == null)
                head.next = tmp;
            start = start.next;
        }
        if(extra == 1){
            ListNode tmp = new ListNode(1);
            start.next = tmp;
            start = start.next;
        }
        return head.next;
    }
}
