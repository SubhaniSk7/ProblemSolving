package gfg.ds.Arrays.rotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxHammingDistance {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		hammingDistance(arr);
	}

	public static void hammingDistance(int[] arr) {

		int i, n = arr.length, maxHam = 0;
		int[] temp = new int[2 * n];
		for (i = 0; i < n; i++)
			temp[i] = temp[i + n] = arr[i];

		for (i = 1; i < n; i++) {
			int hamDistance = 0;
			for (int j = i, k = 0; j < (i + n); j++, k++)
				if (arr[k] != temp[j])
					hamDistance++;
			if (hamDistance == n) {
				maxHam = hamDistance;
				break;
			}

			maxHam = Math.max(maxHam, hamDistance);
		}
		System.out.println(maxHam);

	}
}
