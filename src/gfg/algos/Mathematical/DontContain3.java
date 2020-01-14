package gfg.algos.Mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Count numbers that don’t contain digit '3'
public class DontContain3 {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()), j = 0, i, counter;
		int[] result = new int[t];
		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			counter = 0;
			for (i = 1; i <= n; i++) {
				boolean notContain3 = digit3_2(i);
				if (notContain3) {
					counter++;
				}
			}
			result[j++] = counter;
		}
		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	// method 1
	public static boolean digit3_1(int num) {

		int rem;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			if (rem == 3)
				return false;
		}
		return true;
	}

	// method 2
	public static boolean digit3_2(int num) {

		String n = Integer.toString(num);
		if (n.contains("3"))
			return false;

		return true;

	}
}
