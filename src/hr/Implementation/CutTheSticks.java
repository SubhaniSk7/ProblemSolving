package hr.Implementation;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int i, j, minlength = 100000, templength, sticksCount;

		for (i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			if (minlength > arr[i]) {
				minlength = arr[i];
			}
		}
		sticksCount = n;
		while (minlength > 0) {

			templength = 100000;
			System.out.println(sticksCount);
			sticksCount = 0;
			for (i = 0; i < n; i++) {

				if (arr[i] > 0) {

					arr[i] -= minlength;
					if (arr[i] > 0)
						sticksCount += 1;
					if (arr[i] > 0 && templength >= arr[i]) {
						templength = arr[i];
					}
				}
			}
			if (templength == 100000) {
				break;
			} else
				minlength = templength;
		}
	}
}
