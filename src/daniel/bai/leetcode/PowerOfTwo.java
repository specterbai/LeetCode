package daniel.bai.leetcode;

public class PowerOfTwo {
	/* LeetCode No. 231
	 * Power Of Two
	 * @author Daniel Bai
	 */
	
	public boolean isPowerOfTwo(int n){
		if(n < 1){
			return false;
		}
		if(n == 1)
			return true;
		while(n > 2){
			if(n % 2 == 1)
				return false;
			n = n >> 1;
		}
		return true;
	}
}
