package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1342A_RoadToZero {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long x = Long.parseLong(st.nextToken()), y = Long.parseLong(st.nextToken());
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
			solve(x, y, a, b);
		}
	}

	public static void solve(long x, long y, long a, long b) {
//		System.out.println(x + " " + y + " " + a + " " + b);
		long cost = 0;
		if (x == 0 && y == 0) {
			cost = 0;
		} else if (x == 0) {
			cost = y * a;
		} else if (y == 0) {
			cost = x * a;
		} else {
			long min = x, max = y;
			if (x > y) {
				min = y;
				max = x;
			}
			if (2 * a > b) {
				cost += min * b;
				max -= min;
				min = 0;
				cost += max * a;
//				System.out.println(min + " " + max);
			} else {
				cost = (min + max) * a;
			}
		}
		System.out.println(cost);
	}
}
