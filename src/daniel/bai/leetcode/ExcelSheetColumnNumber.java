package daniel.bai.leetcode;

public class ExcelSheetColumnNumber {
	/*
	 * LeetCode No. 171
	 * Excel Sheet Column Number
	 * @author Daniel Bai
	 */
	public int titleToNumber(String s){
		char[] c = s.toCharArray();
		int base = 1;
		int result = 0;
		for(int i = c.length-1; i >= 0; i --){
			result += base * (c[i]-64);
			base *= 26;
		}
		return result;
	}
}
