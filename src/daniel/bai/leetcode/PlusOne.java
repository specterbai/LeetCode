package daniel.bai.leetcode;

public class PlusOne {
	/*
	 * LeetCode No. 66
	 * Plus One
	 * @author Daniel Bai
	 */
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i --){
            if(digits[i] == 9){
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }
        if(digits[0] == 0){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            for(int i = 1; i < res.length; i ++){
                res[i] = digits[i-1];
            }
            return res;
        } else {
            return digits;
        }
    }
}
