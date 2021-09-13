package basics.freq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SpecialElementsInMatrix {
	public static int m, n;
	public static int[][] nums;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		m = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());
		nums = new int[m][n];
		for (int i = 0; i < m; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int j = 0; j < n; ++j) {
				nums[i][j] = Integer.parseInt(st.nextToken());
				al.add(nums[i][j]);
			}
		}
		solve();
	}

	public static void solve() {
		int[] rMax = new int[m], rMin = new int[m];
		int[] cMax = new int[n], cMin = new int[n];

		for (int i = 0; i < m; ++i) {
			int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int j = 0; j < n; ++j) {
				int val = nums[i][j];
				map.put(val, map.getOrDefault(val, 0) + 1);
				max = Math.max(max, val);
				min = Math.min(min, val);
			}
			if (map.get(max) > 1 || map.get(min) > 1)
				System.out.println(-1);
			rMax[i] = max;
			rMin[i] = min;
		}

		for (int i = 0; i < n; ++i) {
			int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int j = 0; j < m; ++j) {
				int val = nums[i][j];
				map.put(val, map.getOrDefault(val, 0) + 1);
				max = Math.max(max, val);
				min = Math.min(min, val);
			}
			if (map.get(max) > 1 || map.get(min) > 1)
				System.out.println(-1);
			cMax[i] = max;
			cMin[i] = min;
		}

		int ans = 0;
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				int val = nums[i][j];
				if (val == rMax[i] || val == rMin[i] || val == cMax[j] || val == cMin[j])
					ans++;
			}
		}
		if (ans == 0)
			System.out.println(-1);
		else
			System.out.println(ans);
	}
}

//3
//3
//1 2 1
//3 5 7
//8 9 6
