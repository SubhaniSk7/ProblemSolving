//incomplete
package codechef.challenges2018.may2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChangeTheSigns {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		int[] a;
		int n, i, j, k, aSum = 0;

		while (t > 0) {
			n = Integer.parseInt(br.readLine());
			a = new int[n];

			StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
			for (i = 0; i < n; i++) {
				a[i] = Integer.parseInt(tk.nextToken());
				aSum += a[i];
			}
			for (i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();

			t--;
		}

	}
}
