package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q69_SqrtX {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		System.out.println(mySqrt(x));
	}

	public static int mySqrt(int x) {
		long ans = 0, L = 0, R = x;
		while (L <= R) {
			long mid = L + (R - L + 1) / 2;
			if (mid * mid == x)
				return (int) mid;
			else if (mid * mid < x) {
				ans = mid;
				L = mid + 1;
			} else
				R = mid - 1;
		}
		return (int) ans;
	}
}
