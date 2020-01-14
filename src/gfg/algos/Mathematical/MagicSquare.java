package gfg.algos.Mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//only for Odd number
public class MagicSquare {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter only Odd number:");
		int n = Integer.parseInt(br.readLine());

		int[][] ms = new int[n][n];
		int num = 0, i = 0, j = n / 2, r, c;

		for (num = 1; num <= n * n; num++) {
			// System.out.println("---------------------");
			// System.out.println(i + ":" + j);
			if (ms[i][j] != 0) {
				i += 2;
				j -= 1;
				// System.out.println(i + ":" + j);
			}

			ms[i][j] = num;
			i--;
			j++;

			if (i == -1 && j == n) {
				i += 2;
				j -= 1;
			}
			if (i == -1 && j != n)
				i = n - 1;
			if (i != -1 && j == n)
				j = 0;

			// for (r = 0; r < n; r++) {
			// for (c = 0; c < n; c++)
			// System.out.print(" " + ms[r][c] + "\t| ");
			// System.out.println();
			// }
			// System.out.println();
			// System.out.println(i + ":" + j);
		}

		for (r = 0; r < n; r++) {
			for (c = 0; c < n; c++)
				System.out.print(" " + ms[r][c] + "\t| ");
			System.out.println();
		}

		System.out.println("Sum:" + (n * (n * n + 1) / 2));
	}
}
