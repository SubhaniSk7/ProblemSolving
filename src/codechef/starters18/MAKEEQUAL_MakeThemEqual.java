package codechef.starters18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class MAKEEQUAL_MakeThemEqual {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] a = new int[n];
			int max = -1, min = Integer.MAX_VALUE;
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for (int i = 0; i < n; ++i) {
				a[i] = Integer.parseInt(st.nextToken());
				max = Math.max(max, a[i]);
				min = Math.min(min, a[i]);
				map.put(a[i], map.getOrDefault(a[i], 0) + 1);
			}
			System.out.println(max - min);
		}
	}
}
