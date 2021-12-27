package codechef.nov2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ALLDIV3_MakeItDivisible {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count1 = 0, count2 = 0;
			for (int i = 0; i < n; ++i) {
				a[i] = Integer.parseInt(st.nextToken()) % 3;
				if (a[i] == 1)
					count1++;
				if (a[i] == 2)
					count2++;
			}
			int min = Math.min(count1, count2), max = Math.max(count1, count2);
			int remaining = max - min;
			int ans = 0;
			if (remaining % 3 == 0)
				ans = min + 2 * (remaining / 3);
			else
				ans = -1;
			System.out.println(ans);
		}
	}
}
