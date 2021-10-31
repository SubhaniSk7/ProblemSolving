package leetproblems;

import java.util.Arrays;

public class Q435_Non_overlappingIntervals {
	public int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		int result = 0;
		int[] prev = intervals[0];
		for (int i = 1; i < intervals.length; ++i) {
			int[] cur = intervals[i];
			if (prev[1] <= cur[0]) {
				prev = cur;
			} else {
				result++;
				prev[1] = Math.min(prev[1], cur[1]);// deleting max end interval
			}
		}
		return result;
	}
}
