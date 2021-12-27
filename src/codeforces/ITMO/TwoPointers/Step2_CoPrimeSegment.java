package codeforces.ITMO.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step2_CoPrimeSegment {
	public static long[] nums;
	public static long[] segTree;

	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static long constructSegTree(int start, int end, int pos) {
		if (start == end) {
			segTree[pos] = nums[start];
			return segTree[pos];
		}
		int mid = start + (end - start) / 2;
		long left = constructSegTree(start, mid, 2 * pos + 1);
		long right = constructSegTree(mid + 1, end, 2 * pos + 2);
		segTree[pos] = gcd(left, right);
		return segTree[pos];
	}

	public static long query(int start, int end, int l, int r, int pos) {
		if (l <= start && end <= r)
			return segTree[pos];
		if (end < l || start > r)
			return 0L;

		int mid = start + (end - start) / 2;
		long left = query(start, mid, l, r, 2 * pos + 1);
		long right = query(mid + 1, end, l, r, 2 * pos + 2);
		return gcd(left, right);
	}

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		nums = new long[n];
		for (int i = 0; i < n; ++i)
			nums[i] = Long.parseLong(st.nextToken());

		int x = (int) Math.ceil(Math.log(n) / Math.log(2));
		int segSize = (int) (2 * Math.pow(2, x) - 1);
		segTree = new long[segSize];
		constructSegTree(0, n - 1, 0);
		solve(n);
	}

	public static void solve(int n) {
		int r = 0;
		long result = Integer.MAX_VALUE;
		for (int l = 0; l < n; ++l) {
			while (r < n && query(0, n - 1, l, r, 0) != 1)
				r++;
			if (r == n)
				break;
			result = Math.min(result, r - l + 1);
			r = Math.max(l, r);
		}
		if (result == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(result);
	}
}
