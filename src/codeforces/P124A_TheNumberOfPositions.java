package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P124A_TheNumberOfPositions {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

		int result = 0;
//		for (int i = 0; i <= b; ++i) {
//			if (n - i - 1 >= a)
//				result++;
//		}
		result = n - Math.max(a + 1, n - b) + 1;

		System.out.println(result);
	}
}
