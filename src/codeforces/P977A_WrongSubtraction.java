package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P977A_WrongSubtraction {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		solution(n, k);
	}

	public static void solution(int n, int k) {
		for (int i = 0; i < k; ++i) {
			if (n % 10 != 0)
				n--;
			else
				n /= 10;
		}
		System.out.println(n);
	}
}
