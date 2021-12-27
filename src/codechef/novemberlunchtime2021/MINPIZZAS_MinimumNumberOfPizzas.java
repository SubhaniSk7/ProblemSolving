package codechef.novemberlunchtime2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MINPIZZAS_MinimumNumberOfPizzas {
	public static void main(String[] subhani) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			long n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			long val = lcm(n, k) / k;
			sb.append(val + "\n");
		}
		System.out.println(sb.toString());
	}

	public static long gcd(long x, long y) {
		if (y == 0)
			return x;
		return gcd(y, x % y);
	}

	public static long lcm(long x, long y) {
		long val = (x / gcd(x, y)) * y;
		return val;
	}
}
