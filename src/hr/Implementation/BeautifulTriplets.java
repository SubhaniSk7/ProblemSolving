package hr.Implementation;

import java.util.Scanner;

public class BeautifulTriplets {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] arr = new int[n];
		int i, j, k, index = 0, flag = 0, count = 0;

		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (i = 0; i < arr.length - 1; i++) {
			flag = 0;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] == d) {
					index = j;
					flag = 1;
				}
			}
			if (flag == 1) {
				flag = 0;
				for (k = index + 1; k < arr.length; k++) {
					if (arr[k] - arr[index] == d) {
						flag = 1;
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
