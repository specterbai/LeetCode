package daniel.bai.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfDigitOne {
	/*
	 * LeetCode No. 233
	 * Number of Digit One
	 * @author Daniel Bai
	 */
	static Map<Integer, Integer> mapping;
	static{
		mapping = new HashMap<Integer, Integer>();
		mapping.put(0, 0);
		mapping.put(10, 1);
		int t = 10;
		for(int i = 0; i < 8; i ++){
			mapping.put(t*10, mapping.get(t)*10 + t);
			t *= 10;
		}
	}
	public int countDigitOne(int n){
		int flag = 1000000000;
		return countDigitOne(n/flag, n%flag, flag);		
	}
	
	public int countDigitOne(int pre, int suf, int flag){
		if(flag == 1){
			if(pre >= 1)
				return 1;
			else
				return 0;
		}
		flag /= 10;
		if(pre == 0){
			return countDigitOne(suf/flag, suf%flag, flag);
		} else if(pre == 1) {
			return suf + 1 + mapping.get(flag*10) + countDigitOne(suf/flag, suf%flag, flag);
		} else {
			return pre*mapping.get(flag*10) + flag * 10 + countDigitOne(suf/flag, suf%flag, flag);
		}
	}
}
