package daniel.bai.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	/*
	 * LeetCode No. 54
	 * Spiral Matrix
	 * @author Daniel Bai
	 */
	
	public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result = new ArrayList<Integer>();
        if(matrix.length == 0)
            return result;
		int i = 0;
		int j = 0;
		int k = matrix.length-1;
		int l = matrix[0].length - 1;
		while(k > i && l > j){
			for(int f = j; f < l; f ++){
				result.add(matrix[i][f]);
			}
			for(int f = i; f < k; f ++){
				result.add(matrix[f][l]);
			}
			for(int f = l; f > j; f --){
				result.add(matrix[k][f]);
			}
			for(int f = k; f > i; f --){
				result.add(matrix[f][j]);
			}
			i++;
			j++;
			k--;
			l--;
		}
		if(i == k && j == l){
		    result.add(matrix[i][j]);
		} else if(i == k) {
		    for(int f = j; f <= l; f++){
		        result.add(matrix[i][f]);
		    }
		} else if(j == l) {
		    for(int f = i; f <= k; f++){
		        result.add(matrix[f][j]);
		    }
		}
		return result;
	}
}
