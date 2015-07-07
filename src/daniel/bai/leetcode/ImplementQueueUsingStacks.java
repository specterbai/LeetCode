package daniel.bai.leetcode;

import java.util.Stack;

public class ImplementQueueUsingStacks {
	
	/*
	 * LeetCode No. 232
	 * Implement Queue Using Stacks
	 * @author Daniel Bai
	 */
	
    Stack<Integer> main;
    Stack<Integer> sub;
    
    ImplementQueueUsingStacks(){
        main = new Stack<Integer>();
        sub = new Stack<Integer>();
    }
    
    public void push(int x) {
        while(main.size() > 0){
            sub.push(main.pop());
        }
        main.push(x);
        while(sub.size() > 0){
            main.push(sub.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        main.pop();
    }

    // Get the front element.
    public int peek() {
        return main.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return main.size() == 0;
    }
}
