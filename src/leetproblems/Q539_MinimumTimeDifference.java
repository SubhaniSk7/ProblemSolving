package leetproblems;

import java.util.List;

public class Q539_MinimumTimeDifference {
	public int findMinDifference(List<String> timePoints) {
		int h, m, minutes, diff = Integer.MAX_VALUE;
		boolean[] time = new boolean[24 * 60];
		for (String t : timePoints) {
			String[] s = t.split(":");
			h = Integer.parseInt(s[0]);
			m = Integer.parseInt(s[1]);
			minutes = h * 60 + m;
			if (time[minutes])
				return 0;
			time[minutes] = true;
		}

		int first = -1, prev = -1;
		for (int i = 0; i < 1440; ++i) {
			if (time[i]) {
				if (first == -1) {
					first = i;
					prev = i;
				} else {
					diff = Math.min(diff, Math.min(i - prev, 1440 - i + prev));
					prev = i;
				}
			}
		}
		diff = Math.min(diff, Math.min(prev - first, 1440 - prev + first));
		return diff;
	}
}
