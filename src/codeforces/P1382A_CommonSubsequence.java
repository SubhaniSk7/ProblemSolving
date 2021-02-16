package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

public class P1382A_CommonSubsequence {
	public static BitSet a = new BitSet(1001), b = new BitSet(1001);

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				a.set(Integer.parseInt(st.nextToken()));
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; ++i)
				b.set(Integer.parseInt(st.nextToken()));
			sol(n, m);
			a.clear();
			b.clear();
		}
	}

	public static void sol(int n, int m) {
		int len = 0, num = 0;
		if (a.intersects(b)) {
			len = 1;
			for (int i = 0; i < 1001; ++i) {
				if (a.get(i) == true && b.get(i) == true) {
					num = i;
					break;
				}
			}
			System.out.println("YES\n" + len + " " + num);
		} else {
			System.out.println("NO");
		}
	}
}
