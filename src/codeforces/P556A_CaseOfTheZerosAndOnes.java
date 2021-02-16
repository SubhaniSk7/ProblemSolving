package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P556A_CaseOfTheZerosAndOnes {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		solution(n, s);
	}

	public static void solution(int n, String s) {
		int ones = n - s.replaceAll("1", "").length(), zeroes = n - ones;
		System.out.println(Math.abs(ones - zeroes));
	}
}
