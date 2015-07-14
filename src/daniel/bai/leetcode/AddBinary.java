package daniel.bai.leetcode;

public class AddBinary {
	/*
	 * LeetCode No. 67
	 * Add Binary
	 * @author Daniel Bai
	 */
	public String addBinary(String a, String b){
		int l = Math.max(a.length(), b.length()) + 1;
		char[] sa = new char[l];
		char[] sb = new char[l];
		char[] sc = new char[l];
		int d = l-1;
		for(int i = a.length() - 1; i >= 0; i --){
			sa[d--] = a.charAt(i);
		}
		for(int i = d; i >= 0; i --){
			sa[i] = '0';
		}
		d = l-1;
		for(int i = b.length() - 1; i >= 0; i --){
			sb[d--] = b.charAt(i);
		}
		for(int i = d; i >= 0; i --){
			sb[i] = '0';
		}
		for(int i = 0; i < l; i ++){
			sc[i] = '0';
		}
		StringBuilder ss = new StringBuilder();
		for(int i = l-1; i >= 0 ; i --){
			int dig = sa[i] + sb[i] + sc[i] - 144;
			if(dig >= 2){
				dig -= 2;
				sc[i-1] = '1';
			}
			ss.insert(0, dig);
		}
		while(ss.charAt(0) == '0' && ss.length() > 1){
			ss.deleteCharAt(0);
		}
		return ss.toString();
	}
	
	public static void main(String args[]){
		AddBinary ab = new AddBinary();
		System.out.println(ab.addBinary("1", "0"));
	}
}
