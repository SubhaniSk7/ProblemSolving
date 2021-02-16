package codeforces;

import java.io.*;

public class P959A_MahmoudAndEhabAndTheEvenOddGame {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

	public static void solution(int n) {
		if (n % 2 == 0)
			System.out.println("Mahmoud");
		else
			System.out.println("Ehab");
	}
}
