package daniel.bai.leetcode;

public class StringtoInteger {
	/*
	 * LeetCode No. 8
	 * String to Integer (atoi)
	 * @author Daniel Bai
	 */
    public int myAtoi(String str) {
        if(str.length() < 1)
            return 0;
        long result = 0;
        char[] c = str.toCharArray();
        int start = 0;
        while(str.charAt(start) == ' '){
            start++;
        }
        if(str.charAt(start) == '-' || str.charAt(start) == '+'){
            start += 1;
        }
        for(int i = start; i < c.length; i ++){
            if(c[i] < 48 || c[i] > 57)
                break;
            if(c[i] == ' ')
            	continue;
            result *= 10;
            result += (c[i]-48);
            if(result > Integer.MAX_VALUE)
                break;
        }
        if(start > 0 && str.charAt(start-1) == '-')
        	result = 0 - result;
        if(result > Integer.MAX_VALUE)
        	return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
        	return Integer.MIN_VALUE;
        return (int)result;
    }
}
