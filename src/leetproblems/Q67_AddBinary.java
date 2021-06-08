package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q67_AddBinary {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken(), b = st.nextToken();
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
		String ans = "";
		int n = a.length(), m = b.length(), max = Math.max(n, m);
		if (n > m) {
			int diff = n - m;
			b = addLeads(b, diff);
		}
		if (n < m) {
			int diff = m - n;
			a = addLeads(a, diff);
		}
		int carry = 0;
		for (int i = max - 1; i >= 0; --i) {
			int val = Integer.parseInt("" + a.charAt(i)) ^ Integer.parseInt("" + b.charAt(i)) ^ carry;
			int count = Integer.parseInt("" + a.charAt(i)) + Integer.parseInt("" + b.charAt(i)) + carry;
			if (count >= 2)
				carry = 1;
			else
				carry = 0;
			ans = val + ans;
		}
		if (carry == 1)
			ans = "1" + ans;
		return ans;
	}

	public static String addLeads(String x, int n) {
		for (int i = 0; i < n; ++i)
			x = "0" + x;
		return x;
	}
}
