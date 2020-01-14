package gfg.ds.Arrays.rotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PairSum {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];

			int i, j;
			st = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			Arrays.sort(arr);

			for (i = 0, j = n - 1; i < j;) {
				if (arr[i] < k) {
					if (arr[j] == k - arr[i]) {
						System.out.println("Yes");
						break;
					} else if (arr[j] > k - arr[i])
						j--;
					else
						i++;
				} else {
					System.out.println("No");
					break;
				}
			}
			if (i == j)
				System.out.println("No");
		}
	}
}
