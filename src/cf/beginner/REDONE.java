package cf.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class REDONE {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()), n, i;

		long[] arr = new long[1000002];
		arr[1] = 1;

		for (i = 2; i < 1000002; i++)
			arr[i] = (i + arr[i - 1] + (i * arr[i - 1]) % 1000000007) % 1000000007;
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			System.out.println(arr[n]);
		}
	}
}
