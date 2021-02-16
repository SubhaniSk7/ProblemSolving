package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1285A_MezoPlayingZoma {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		solution(n, s);
	}

	public static void solution(int n, String s) {
		int lCount = n - s.replaceAll("R", "").length(), rCount = n - lCount;
		System.out.println(rCount + lCount + 1);// or n+1
	}
}
