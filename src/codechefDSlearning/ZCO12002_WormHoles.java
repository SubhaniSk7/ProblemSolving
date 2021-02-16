package codechefDSlearning;

import java.io.*;
import java.util.*;

public class ZCO12002_WormHoles {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken()),
				y = Integer.parseInt(st.nextToken());
		int[][] contests = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			contests[i][0] = Integer.parseInt(st.nextToken());
			contests[i][1] = Integer.parseInt(st.nextToken());
		}
		TreeSet<Integer> v = new TreeSet<Integer>(), w = new TreeSet<Integer>();
//		int[] v = new int[x];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < x; i++)
			v.add(Integer.parseInt(st.nextToken()));
//		int[] w = new int[y];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < y; i++)
			w.add(Integer.parseInt(st.nextToken()));
		sol(n, x, y, contests, v, w);
	}

	public static void sol(int n, int x, int y, int[][] contests, TreeSet<Integer> v, TreeSet<Integer> w) {
		int ans = Integer.MAX_VALUE;
		Integer startTime, endTime;
		for (int i = 0; i < n; i++) {
			startTime = v.floor(contests[i][0]);
			endTime = w.ceiling(contests[i][1]);
			if (startTime != null && endTime != null)
				ans = Math.min(ans, endTime - startTime + 1);
		}
		System.out.println(ans);
	}
}
