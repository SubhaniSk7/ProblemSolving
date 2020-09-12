package codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CSUM {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			int i, j;
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			Arrays.sort(arr);

			i = 0;
			j = n - 1;
			while (i < j) {

				if (arr[i] + arr[j] == k) {
					System.out.println("Yes");
					break;
				} else if (arr[i] + arr[j] < k)
					i++;
				else
					j--;
			}
			if (i == j)
				System.out.println("No");
		}
	}
}
