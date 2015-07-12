package daniel.bai.leetcode;

public class LengthOfLastWord {
	/*
	 * LeetCode No. 58 
	 * Length of Last Word
	 * @author Daniel Bai
	 */
	public int lengthOfLastWord(String s) {
		StringBuilder sb = new StringBuilder(s);
		while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 32)
			sb.deleteCharAt(sb.length() - 1);
		int result = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) != 32) {
				result++;
			} else {
				result = 0;
			}
		}
		return result;
	}
}
