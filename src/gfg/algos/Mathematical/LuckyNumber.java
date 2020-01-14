package gfg.algos.Mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyNumber {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		int[] result = new int[t];
		int i = 0;
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			result[i++] = isLuckyNumber(n);
		}
		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	static int isLuckyNumber(int n) {
		int position = n, counter = 2;
		while (true) {
			if (position % counter == 0)
				return 0;
			if (position < counter)
				return 1;
			position = position - (position / counter);

			counter++;
		}
	}
}
