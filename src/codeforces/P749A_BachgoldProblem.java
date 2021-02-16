package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P749A_BachgoldProblem {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

	public static void solution(int n) {
		int count = 0, t = n;
		if (n % 2 == 1) {
			count++;
			n -= 3;
		}
		count += (n / 2);
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			if (t % 2 == 1 && i == 0)
				System.out.print(3 + " ");
			else
				System.out.print(2 + " ");

		}
	}
}