package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P935A_FafaAndHisCompany {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

	public static void solution(int n) {
		int ways = 1;// trivial one
		for (int i = 2; i <= n / 2; ++i) {
			int group = (n - i) / i;
			if ((n - i) % i == 0 && (i + (i * group) == n))
				ways++;
		}
		System.out.println(ways);
	}
}
