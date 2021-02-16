package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P344A_Magnets {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] magnets = new String[n];
		for (int i = 0; i < n; ++i)
			magnets[i] = br.readLine();
		solution(n, magnets);
	}

	public static void solution(int n, String[] magnets) {
		int groups = 1;
		for (int i = 0; i < n - 1; ++i)
			if (!magnets[i].equals(magnets[i + 1]))
				groups++;
		System.out.println(groups);
	}
}
