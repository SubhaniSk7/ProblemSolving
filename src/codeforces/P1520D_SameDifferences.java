package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1520D_SameDifferences {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());

			solve(n, arr);
		}
		System.out.println(sb.toString());
	}

	public static void solve(int n, int[] arr) {
		long result = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; ++i) {
			arr[i] = arr[i] - i;
			result += map.getOrDefault(arr[i], 0);
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		sb.append(result + "\n");
	}
}
