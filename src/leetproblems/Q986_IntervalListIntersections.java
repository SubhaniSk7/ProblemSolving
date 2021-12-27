package leetproblems;

import java.util.ArrayList;

public class Q986_IntervalListIntersections {
	public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
		ArrayList<int[]> intervals = new ArrayList<>();
		int i = 0, j = 0;
		int n = firstList.length, m = secondList.length;
		while (i < n && j < m) {
			int[] a = firstList[i], b = secondList[j];
			if (a[0] > b[1]) {
				j++;
				continue;
			}
			if (a[1] < b[0]) {
				i++;
				continue;
			}
			int x = Math.max(a[0], b[0]), y;
			if (a[1] <= b[1]) {
				y = a[1];
				i++;
			} else {
				y = b[1];
				j++;
			}
			intervals.add(new int[] { x, y });
		}
		return intervals.toArray(new int[intervals.size()][]);
	}
}
