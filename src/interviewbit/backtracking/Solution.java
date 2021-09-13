package interviewbit.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n * 2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n * 2; ++i)
			arr[i] = Integer.parseInt(st.nextToken());
		solve(n, arr);
	}

	public static void solve(int n, int[] arr) {

		if (n * 2 <= 4) {
			int x1 = arr[0], y1 = arr[1], x2 = arr[2], y2 = arr[3];
			int a = (y2 - y1), b = (x1 - x2);
			int c = a * x1 + b * y1;
			System.out.println(a + "x1" + b + "y1=" + c);
		} else {
			int x1 = arr[0], y1 = arr[1], x2 = arr[2], y2 = arr[3], x3 = arr[4], y3 = arr[5];
			int m1 = (y2 - y1) / (x2 - x1), m2 = (y3 - y2) / (x3 - x2);
			if (m1 == m2) {
				int a = (y2 - y1), b = (x1 - x2);
				int c = a * x1 + b * y1;
				System.out.println(a + "x1" + b + "y1=" + c);
			} else
				System.out.println(0);
		}
	}
}
