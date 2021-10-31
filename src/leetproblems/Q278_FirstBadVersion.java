package leetproblems;

public class Q278_FirstBadVersion {
	public boolean isBadVersion(int v) {// API in leetcode
		return true;
	}

	public int firstBadVersion(int n) {
		int start = 0, end = n;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (isBadVersion(mid))
				end = mid;
			else
				start = mid + 1;
		}
		if (start == end && isBadVersion(start))
			return start;
		return -1;
	}
}
