package codeforces;

import java.io.*;
import java.util.*;

public class P492B_VanyaAndLanterns {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] lanterns = new int[n];
		for (int i = 0; i < n; ++i)
			lanterns[i] = Integer.parseInt(st.nextToken());
		solution(n, l, lanterns);
	}

	public static void solution(int n, int l, int[] lanterns) {
		Arrays.parallelSort(lanterns);
		int[] diff = new int[n + 1];
		diff[0] = lanterns[0] - 0;
		double maxDiff = diff[0];
		for (int i = 1; i < n; ++i) {
			diff[i] = lanterns[i] - lanterns[i - 1];
			maxDiff = Math.max(maxDiff, diff[i]);
		}
		diff[n] = l - lanterns[n - 1];
		maxDiff = Math.max(maxDiff, diff[n]);
		if (lanterns[0] != 0 && lanterns[n - 1] == l)
			System.out.println(Math.max(diff[0], maxDiff / 2));
		else if (lanterns[0] == 0 && lanterns[n - 1] != l)
			System.out.println(Math.max(diff[n], maxDiff / 2));
		else if (lanterns[0] != 0 && lanterns[n - 1] != l)
			System.out.println(Math.max(diff[0], Math.max(diff[n], maxDiff / 2)));
		else
			System.out.println(maxDiff / 2);
	}
}
