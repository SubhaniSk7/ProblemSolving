package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1472B_FairDivision {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] a = new int[n];
			Map<Integer, Integer> candies = new HashMap<>();
			int total = 0;
			for (int i = 0; i < n; ++i) {
				a[i] = Integer.parseInt(st.nextToken());
				candies.put(a[i], candies.getOrDefault(a[i], 0) + 1);
				total += a[i];
			}

			if (total % 2 != 0)
				System.out.println("NO");
			else {
				int ones = candies.getOrDefault(1, 0), twos = candies.getOrDefault(2, 0);
				if (twos % 2 == 0 && ones % 2 == 0)
					System.out.println("YES");
				else if (twos != n && twos % 2 != 0 && ones % 2 == 0) {
					System.out.println("YES");
				} else
					System.out.println("NO");
			}
		}
	}
}
