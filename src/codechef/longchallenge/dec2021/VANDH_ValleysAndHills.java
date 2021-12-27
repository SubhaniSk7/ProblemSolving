package codechef.longchallenge.dec2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VANDH_ValleysAndHills {
	public static void main(String[] subhani) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			solve(n, m);
		}
	}

	public static void solve(int n, int m) {
		StringBuilder sb = new StringBuilder();
		if (n == m) {
			for (int i = 0; i < n + 1; ++i)
				sb.append("01");
		} else if (n > m) {
			for (int i = 0; i < m + 1; ++i)
				sb.append("01");
			for (int i = 0; i < n - m - 1; ++i)
				sb.append("001");
			sb.append("0");
		} else {// m>n
			for (int i = 0; i < n + 1; ++i)
				sb.append("10");
			for (int i = 0; i < m - n - 1; ++i)
				sb.append("110");
			sb.append("1");
		}
		System.out.println(sb.length());
		System.out.println(sb.toString());
	}
}
