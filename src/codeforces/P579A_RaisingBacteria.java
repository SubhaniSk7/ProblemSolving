package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P579A_RaisingBacteria {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

	public static void solution(int n) {
		System.out.println(Integer.bitCount(n));
	}
}
