package daniel.bai.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	/*
	 * LeetCode No. 3
	 * Longest SubString without Repeating Characters
	 * @author Daniel Bai
	 */
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        Queue<Character> queue = new LinkedList<Character>();
        Set<Character> set = new HashSet<Character>();
        for(int i = 0; i < s.length(); i ++){
            if(!set.contains(s.charAt(i))){
                queue.offer(s.charAt(i));
                set.add(s.charAt(i));
                count = Math.max(count, queue.size());
            } else {
                while(true){
                	char c = queue.poll();
                    set.remove(c);
                    if(c == s.charAt(i))
                    	break;
                }
                queue.offer(s.charAt(i));
                set.add(s.charAt(i));
                count = Math.max(count, queue.size());
            }
        }
        return count;
    }
    public static void main(String args[]){
    	LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
    	System.out.println(l.lengthOfLongestSubstring("aa"));
    }
}
