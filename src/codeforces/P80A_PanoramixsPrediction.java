package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P80A_PanoramixsPrediction {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		solution(n, m);
	}

	public static void solution(int n, int m) {
		boolean prime = false;
		for (int i = n + 1; i <= m; ++i) {
			if (i == m && primeOrNot(i))
				prime = true;
			else if (i != m && primeOrNot(i)) {
				prime = false;
				break;
			}
		}
		if (prime)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static boolean primeOrNot(int num) {
		for (int i = 2; i <= Math.floor(Math.sqrt(num)); ++i)
			if (num % i == 0)
				return false;
		return true;
	}
}
