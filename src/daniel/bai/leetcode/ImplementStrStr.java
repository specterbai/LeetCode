package daniel.bai.leetcode;

public class ImplementStrStr {
	/*
	 * LeetCode No. 28
	 * Implement strStr()
	 * @author Daniel Bai
	 */
	public int strStr(String haystack, String needle){
		return haystack.indexOf(needle);
	}
	
	public static void main(String args[]){
		ImplementStrStr ip = new ImplementStrStr();
		System.out.println(ip.strStr("Daniel Bai", "Bai"));
	}
}
