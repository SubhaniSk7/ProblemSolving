package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1538A_StoneGame {
	public static int[] stones;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			stones = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				stones[i] = Integer.parseInt(st.nextToken());
			solve(n);
		}
	}

	public static void solve(int n) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minIndex = -1, maxIndex = -1, minLeft = -1, minRight = -1,
				maxLeft = -1, maxRight = -1, steps = 0;
		for (int i = 0; i < n; ++i) {
			if (max < stones[i]) {
				max = stones[i];
				maxIndex = i;
			}
			if (min > stones[i]) {
				min = stones[i];
				minIndex = i;
			}
		}
		minLeft = minIndex;
		minRight = n - 1 - minIndex;
		maxLeft = maxIndex;
		maxRight = n - 1 - maxIndex;
		if (minLeft < minRight) {
			if (minLeft < Math.min(maxLeft, maxRight)) {
				steps = minLeft + 1;
				maxLeft = maxLeft - steps;
				steps = steps + Math.min(maxLeft, maxRight) + 1;
			} else if (maxLeft < maxRight) {
				steps = maxLeft + 1;
				minLeft = minLeft - steps;
				steps = steps + Math.min(minLeft, minRight) + 1;
			} else {
				steps = maxRight + 1;
				minRight = minRight - steps;
				steps = steps + Math.min(minLeft, minRight) + 1;
			}

		} else {
			if (minRight < Math.min(maxLeft, maxRight)) {
				steps = minRight + 1;
				maxRight = maxRight - steps;
				steps = steps + Math.min(maxLeft, maxRight) + 1;
			} else if (maxLeft < maxRight) {
				steps = maxLeft + 1;
				minLeft = minLeft - steps;
				steps = steps + Math.min(minLeft, minRight) + 1;
			} else {
				steps = maxRight + 1;
				minRight = minRight - steps;
				steps = steps + Math.min(minLeft, minRight) + 1;
			}
		}
		System.out.println(steps);
	}
}
