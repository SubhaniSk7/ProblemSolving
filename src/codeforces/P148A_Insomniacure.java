package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P148A_Insomniacure {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine()), l = Integer.parseInt(br.readLine()),
				m = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine()),
				d = Integer.parseInt(br.readLine());
		solution(k, l, m, n, d);
	}

	public static void solution(int k, int l, int m, int n, int d) {
		int damaged = 0;
		for (int i = 1; i <= d; ++i)
			if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0)
				damaged++;
		System.out.println(damaged);
	}
}
