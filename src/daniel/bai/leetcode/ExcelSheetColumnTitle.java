package daniel.bai.leetcode;

public class ExcelSheetColumnTitle {
	/*
	 * LeetCode No. 168
	 * Excel Sheet Column Title
	 * @author Daniel Bai
	 */
	public String covertToTitle(int n){
		StringBuilder sb = new StringBuilder();
		while(n > 0){
			int dig = (n%26 == 0) ? 26 : n%26;
			char c = (char)(dig+64);
			sb.insert(0, c);
			n = (n-dig)/26;
		}
		return sb.toString();
	}
}
