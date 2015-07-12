package daniel.bai.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	/*
	 * LeetCode No. 202
	 * Happy Number
	 * @author Daniel Bai
	 */
    public boolean isHappy(int n) {
        if(n == 1)
            return true;
        Set<Integer> set = new HashSet<Integer>();
        set.add(n);
        while(true){
            int t = run(n);
            if(t == 1)
                return true;
            if(set.contains(t))
                return false;
            set.add(t);
            n = t;
        }
    }
    public int run(int n){
        int res = 0;
        while(n > 0){
            res += Math.pow(n%10, 2);
            n /= 10;
        }
        return res;
    }
}
