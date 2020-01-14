package cf.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LUCKFOUR {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			long n = Integer.parseInt(br.readLine());
			fourCount(n);
		}
	}

	public static void fourCount(long n) {

		long r;
		int count = 0;
		while (n > 0) {
			if (n % 10 == 4)
				count++;
			n = n / 10;
		}
		System.out.println(count);
	}
}
