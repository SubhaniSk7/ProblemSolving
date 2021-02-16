package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P214A_SystemOfEquations {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		solution(n, m);
	}

	public static void solution(int n, int m) {
		int max = Math.max(n, m);
		int count = 0;
		for (int i = 0; i <= max; ++i)
			for (int j = 0; j <= max; ++j)
				if ((i * i + j == n) && (i + j * j == m))
					count++;
		System.out.println(count);
	}
}
