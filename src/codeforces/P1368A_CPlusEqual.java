package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1368A_CPlusEqual {
	public static void main(String[] subhani) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			int count = 0;
			while (a <= n && b <= n) {
				if (a > b) {
					b += a;
				} else
					a += b;
				count++;
			}
			System.out.println(count);
		}
	}
}
