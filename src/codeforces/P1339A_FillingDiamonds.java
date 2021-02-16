package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1339A_FillingDiamonds {
	public static ArrayList<Long> dp = new ArrayList<>();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sol(n);
		}
	}

	public static void sol(int n) {
		System.out.println(n);
	}
}
