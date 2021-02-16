package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1180A_AlexAndaRhombus {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		sol(n);
	}

	public static void sol(int n) {
		int rhombus = 0;
		if (n == 1)
			rhombus = 1;
		else {
			int num = 2 * n - 1;
			rhombus = num;
			for (int i = num - 2; i > 0; i -= 2)
				rhombus += (2 * i);
		}
		System.out.println(rhombus);
	}
}
