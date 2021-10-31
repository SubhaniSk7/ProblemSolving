package leetproblems;

public class Q836_RectangleOverlap {
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		int r1_left = rec1[0], r1_bottom = rec1[1], r1_right = rec1[2], r1_top = rec1[3];
		int r2_left = rec2[0], r2_bottom = rec2[1], r2_right = rec2[2], r2_top = rec2[3];

		return !((r1_right <= r2_left) || (r2_right <= r1_left) || (r1_top <= r2_bottom) || (r2_top <= r1_bottom));
	}
}
