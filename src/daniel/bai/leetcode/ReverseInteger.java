package daniel.bai.leetcode;

public class ReverseInteger {
	/*
	 * LeetCode No. 7
	 * Reverse Integer
	 * @author Daniel Bai
	 */
    public int reverse(int x) {
        int result = 0;
        while(x != 0){
            if(result > 214748364 || result < -214748364)
        		return 0;
            result *= 10;
            result += x%10;
            x /= 10;
        }
        
        return result;
    }
}
