package codechef.longchallenge.dec2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class LISTLIST_ListOfLists {
	public static void main(String[] subhani) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] nums = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				nums[i] = Integer.parseInt(st.nextToken());
			System.out.println(solve(n, nums));
		}
	}

	public static int solve(int n, int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int f = 0;
		for (int x : nums) {
			map.put(x, map.getOrDefault(x, 0) + 1);
			f = Math.max(f, map.get(x));
		}
		if (n == 1 || f == n)
			return 0;
		else if (f >= 2)
			return n - f + 1;
		else
			return -1;
	}
}
