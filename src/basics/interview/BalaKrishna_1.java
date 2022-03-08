package basics.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalaKrishna_1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int one = Integer.parseInt(br.readLine());
		int two = Integer.parseInt(br.readLine());
		System.out.println(solve(one, two));
	}

	public static String solve(int one, int two) {
		String add = Math.abs(one / 10 + two / 10) + "" + Math.abs(one % 10 + two % 10);
		String sub = Math.abs(one / 10 - two / 10) + "" + Math.abs(one % 10 - two % 10);
		String mul = Math.abs(one / 10 * two / 10) + "" + Math.abs(one % 10 * two % 10);
		return add + " " + sub + " " + mul;
	}
}
