package daniel.bai.leetcode;

import java.util.LinkedList;
import java.util.List;

public class ClimbingStairs {
	/*
	 * LeetCode No. 70
	 * Climbing Stairs
	 * @author Daniel Bai
	 */
    public int climbStairs(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else if(n == 2)
            return 2;
        else{
            List<Integer> list = new LinkedList<Integer>();
            list.add(1);
            list.add(2);
            for(int i = 3; i <= n; i++){
                list.add(list.get(0) + list.get(1));
                list.remove(0);
            }
            return list.get(1);
        }
    }
}
