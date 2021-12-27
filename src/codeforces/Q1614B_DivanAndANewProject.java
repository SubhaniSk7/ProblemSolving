package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1614B_DivanAndANewProject {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] times = new int[n];
			for (int i = 0; i < n; ++i)
				times[i] = Integer.parseInt(st.nextToken());
			solve(n, times);
		}
	}

	public static void solve(int n, int[] times) {
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> -1 * Integer.compare(a[1], b[1]));
		for (int i = 1; i <= n; ++i)
			pq.add(new int[] { i, times[i - 1] });
		int[] lines = new int[n + 1];
		lines[0] = 0;
		int pos = 1, neg = -1, turn = 0;
		long result = 0;
		while (!pq.isEmpty()) {
			int[] building = pq.poll();
			if (turn % 2 == 0) {
				lines[building[0]] = neg;
				neg--;
			} else {
				lines[building[0]] = pos;
				pos++;
			}
			result += Math.abs(lines[building[0]]) * 2L * building[1];
			turn++;
		}
		System.out.println(result);
		for (int i = 0; i <= n; ++i)
			System.out.print(lines[i] + " ");
		System.out.println();
	}
}
