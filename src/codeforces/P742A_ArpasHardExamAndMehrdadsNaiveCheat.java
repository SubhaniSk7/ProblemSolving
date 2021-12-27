package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P742A_ArpasHardExamAndMehrdadsNaiveCheat {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n == 0)
			System.out.println(1);
		else {
			int[] digit = { 6, 8, 4, 2 };
			n %= 4;
			System.out.println(digit[n]);
		}
	}
}
