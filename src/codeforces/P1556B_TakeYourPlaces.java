package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1556B_TakeYourPlaces {
	public static int[] a;
	public static int n;
	public static ArrayList<Integer> evenIndices, indices;
	public static long ans = 0;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = new int[n];
			ans = 0;
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken()) % 2;
			solve();
		}
	}

	public static void solve() {
		evenIndices = new ArrayList<>();
		ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; ++i)
			if (a[i] == 0)
				evenIndices.add(i);
		for (int r = 0; r < 2; ++r) {
			indices = new ArrayList<Integer>();
			for (int i = r; i < n; i += 2)
				indices.add(i);
			if (indices.size() == evenIndices.size()) {
				long swaps = 0;
				for (int i = 0; i < indices.size(); ++i)
					swaps += Math.abs(indices.get(i) - evenIndices.get(i));
				ans = Math.min(ans, swaps);
			}
		}
		if (ans == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(ans);
	}
}
