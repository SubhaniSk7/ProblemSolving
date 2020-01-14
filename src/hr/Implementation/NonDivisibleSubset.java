package hr.Implementation;

import java.util.Scanner;

public class NonDivisibleSubset {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int i, j, m = 0;
		int[] result = new int[n];

		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				if ((arr[i] + arr[j]) % k != 0) {
					System.out.println(arr[i]+" "+arr[j]);
					result[m] = arr[i];
				}
			}
			m++;
		}
		for (i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
