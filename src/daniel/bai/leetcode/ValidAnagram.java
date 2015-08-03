package daniel.bai.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	/*
	 * LeetCode No. 242
	 * Valid Anagram
	 * @author Daniel Bai
	 */
	
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> smap = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(smap.containsKey(c)){
                smap.put(c, smap.get(c)+1);
            } else {
                smap.put(c, 1);
            }
        }
        for(int i = 0; i < t.length(); i ++){
            char c = t.charAt(i);
            if(smap.containsKey(c)){
                if(smap.get(c) <= 0)
                    return false;
                smap.put(c, smap.get(c)-1);
            } else {
                return false;
            }
        }
        return true;
    }
}
