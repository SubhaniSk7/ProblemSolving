package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1506A_StrangeTable {
	public static void main(String[] subhani) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken());
			long x = Long.parseLong(st.nextToken());

			long r = ((x - 1) % n);
			long c = (long) Math.ceil((x - 1) / n);

			long val = r * m + c + 1;
			System.out.println(val);
		}
	}
}
