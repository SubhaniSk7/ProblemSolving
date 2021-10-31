package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1137_NthTribonacciNumber {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Q509_FibonacciNumber obj = new Q509_FibonacciNumber();
		System.out.println(obj.fib(n));
	}

	public int tribonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		int a = 0, b = 1, c = 1, d = 0;
		for (int i = 3; i <= n; ++i) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
		return d;
	}
}
