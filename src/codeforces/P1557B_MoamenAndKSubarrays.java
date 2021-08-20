package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class P1557B_MoamenAndKSubarrays {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());
			boolean result = solve(arr, n, k);
			if (result)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	public static boolean solve(int[] arr, int n, int k) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; ++i)
			map.put(arr[i], i);

		Iterator itr = map.entrySet().iterator();
		int i = 0, prev = 0, count = 1;
		while (itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) itr.next();
			int second = entry.getValue();
			if (i++ == 0) {
				prev = second;
				continue;
			}
			if (prev + 1 != second)
				count++;
			prev = second;
		}

		if (count <= k)
			return true;
		else
			return false;
	}
}
