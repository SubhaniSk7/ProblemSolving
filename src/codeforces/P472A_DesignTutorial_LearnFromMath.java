package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P472A_DesignTutorial_LearnFromMath {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

	public static void solution(int n) {
		if (n % 2 == 0)
			System.out.println(8 + " " + (n - 8));
		else
			System.out.println(9 + " " + (n - 9));
	}
}
