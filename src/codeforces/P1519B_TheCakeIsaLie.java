package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1519B_TheCakeIsaLie {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()),
					k = Integer.parseInt(st.nextToken());
			solve(n, m, k);
		}
	}

	public static void solve(int n, int m, int k) {
		if (n * m - 1 == k)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
