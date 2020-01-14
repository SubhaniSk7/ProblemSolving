package hr.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] color = new int[n];
		int i, count = 0;
		for (i = 0; i < n; i++) {
			color[i] = sc.nextInt();
		}
		Arrays.sort(color);
		for (i = 0; i < n - 1; i++) {
			if (color[i] == color[i+1]) {
				count++;
				color[i + 1] = -1;
				i++;
			}
			if (i == n - 1) {
				continue;
			}
		}
		System.out.println(count);
	}
}
