package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class P1512A_SpyDetected {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] nums = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				nums[i] = Integer.parseInt(st.nextToken());
			System.out.println(solve(n, nums));
		}
	}

	public static int solve(int n, int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> ind = new HashMap<>();
		int i = 1;
		for (int x : nums) {
			map.put(x, map.getOrDefault(x, 0) + 1);
			ind.put(x, i++);
		}

		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) itr.next();
			if (entry.getValue() == 1) {
				return ind.get(entry.getKey());
			}
		}
		return -1;
	}

}
