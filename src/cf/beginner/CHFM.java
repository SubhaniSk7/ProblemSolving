package cf.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHFM {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			long[] arr = new long[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++)
				arr[i] = Long.parseLong(st.nextToken());
			canSteal(n, arr);
		}
	}

	public static void canSteal(int n, long[] arr) {

		long mean = 0;
		int index = -1, i;
		for (i = 0; i < n; i++)
			mean = mean + arr[i];

		if (mean % n == 0) {
			mean = mean / n;
			for (i = 0; i < n; i++) {
				if (arr[i] == mean) {
					index = i + 1;
					break;
				}
			}
		} // else "Impossible"

		if (index != -1)
			System.out.println(index);
		else
			System.out.println("Impossible");
	}
}
