package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q415_AddStrings {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] buildings = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		String num1 = st.nextToken(), num2 = st.nextToken();
		System.out.println(addStrings(num1, num2));
	}

	public static String addStrings(String num1, String num2) {
		String ans = "";
		int n = num1.length(), m = num2.length(), max = Math.max(n, m);
		if (n > m) {
			int diff = n - m;
			num2 = addLeads(num2, diff);
		}
		if (n < m) {
			int diff = m - n;
			num1 = addLeads(num1, diff);
		}
		int carry = 0;
		for (int i = max - 1; i >= 0; --i) {
			int val = Integer.parseInt("" + num1.charAt(i)) + Integer.parseInt("" + num2.charAt(i)) + carry;
			if (val > 9)
				carry = 1;
			else
				carry = 0;
			ans = (val % 10) + ans;
		}
		if (carry != 0)
			ans = carry + "" + ans;
		return ans;
	}

	public static String addLeads(String x, int n) {
		for (int i = 0; i < n; ++i)
			x = "0" + x;
		return x;
	}
}
