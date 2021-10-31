package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q509_FibonacciNumber {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Q509_FibonacciNumber obj = new Q509_FibonacciNumber();
		System.out.println(obj.fib(n));
	}

	public int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int a = 0, b = 1, c = 0;
		for (int i = 2; i <= n; ++i) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}
