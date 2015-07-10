package daniel.bai.leetcode;

public class RectangleArea {
	/*
	 * LeetCode No. 223
	 * Rectangle Area
	 * @author Daniel Bai
	 */
	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int a = Math.max(A, E);
		int b = Math.max(B, F);
		int c = Math.min(C, G);
		int d = Math.min(D, H);
		return calculateRectangle(A, B, C, D) + calculateRectangle(E, F, G, H)
				- calculateRectangle(a, b, c, d);
	}

	public int calculateRectangle(int a, int b, int c, int d) {
		if (a > c || b > d)
			return 0;
		return (c - a) * (d - b);
	}
}
