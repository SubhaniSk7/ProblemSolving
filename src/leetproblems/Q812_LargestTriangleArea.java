package leetproblems;

public class Q812_LargestTriangleArea {
	public double largestTriangleArea(int[][] points) {
		double area = 0;
		for (int[] a : points) {
			for (int[] b : points) {
				for (int[] c : points) {
					double bh = a[0] * b[1] + b[0] * c[1] + c[0] * a[1] - b[0] * a[1] - c[0] * b[1] - a[0] * c[1];
					area = Math.max(area, 0.5 * Math.abs(bh));
				}
			}
		}
		return area;
	}
}
