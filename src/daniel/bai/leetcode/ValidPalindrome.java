package daniel.bai.leetcode;

public class ValidPalindrome {
	/*
	 * LeetCode No. 125
	 * Valid Palindrome
	 * @author Daniel Bai
	 */
    public boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        int fl = 0;
        int fr = c.length-1;
        while(fr > fl){
            if(!isLetter(c[fl])){
                fl++;
            } else if(!isLetter(c[fr])){
                fr--;
            } else {
                if(c[fl] != c[fr])
                    return false;
                fl++;
                fr--;
            }
        }
        return true;
    }
    public boolean isLetter(char c){
        if(c >= 97 && c <= 122)
            return true;
        if(c >= 48 && c <= 57)
            return true;
        return false;
    }
}
