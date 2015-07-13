package daniel.bai.leetcode;

public class CompareVersionNumbers {
	/*
	 * LeetCode No. 165
	 * Compare Version Numbers
	 * @author Daniel Bai
	 */
	public int compareVersion(String version1, String version2){
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		for(int i = 0; i < Math.min(v1.length, v2.length); i++){
			int n1 = Integer.valueOf(v1[i]);
			int n2 = Integer.valueOf(v2[i]);
			if(n1 == n2)
				continue;
			else
				return n1 > n2 ? 1 : -1;
		}
		int extra = 0;
		for(int i = Math.min(v1.length, v2.length); i < Math.max(v1.length, v2.length); i ++){
			if(v1.length > v2.length){
				extra += Integer.valueOf(v1[i]);
			} else if(v2.length > v1.length){
				extra -= Integer.valueOf(v2[i]);
			}
		}
		return extra == 0 ? 0 : extra / Math.abs(extra);
		
	}
}
