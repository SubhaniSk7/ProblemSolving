package codechef.challenges2018.may2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MightyFriend {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int i, j, l;
		int[] a, motu, tomu;
		int motuSum = 0, tomuSum = 0;

		while (t > 0) {
			int tomuWin = 1;
			StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(tk.nextToken()), k = Integer.parseInt(tk.nextToken());
			a = new int[n];
			motuSum = 0;
			tomuSum = 0;
			if (n % 2 == 0) {
				motu = new int[n / 2];
				tomu = new int[n / 2];
			} else {
				motu = new int[(n / 2) + 1];
				tomu = new int[n / 2];
			}

			tk = new StringTokenizer(br.readLine(), " ");
			j = 0;
			l = 0;
			for (i = 0; i < n; i++) {
				a[i] = Integer.parseInt(tk.nextToken());
				if (i % 2 == 0)
					motu[j++] = a[i];
				else
					tomu[l++] = a[i];
			}

			for (i = 0; i < n; i++) {
				if (i % 2 == 0)
					motuSum += a[i];
				else
					tomuSum += a[i];
			}

			if (motuSum == tomuSum) {
				tomuWin = 0;
			} else if (motuSum > tomuSum) {
				Arrays.sort(motu);
				Arrays.sort(tomu);
				j = motu.length - 1;
				l = 0;
				int temp;
				while (k > 0 && j != 0 && l < a.length / 2) {
					temp = motu[j];
					motu[j] = tomu[l];
					tomu[l] = temp;
					j--;
					l++;
					k--;
				}
				motuSum = 0;
				for (i = 0; i < motu.length; i++)
					motuSum += motu[i];
				tomuSum = 0;
				for (i = 0; i < tomu.length; i++)
					tomuSum += tomu[i];

				if (motuSum >= tomuSum)
					tomuWin = 0;
			}
			if (tomuWin == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}
	}
}
