package hr.Implementation;

import java.util.Scanner;

public class FlatlandSpaceStations {

	public static void main(String subhani[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int c[] = new int[m];
		int i, j, k, max = Integer.MIN_VALUE, distance = 0;
		int[] cities = new int[n];
		for (i = 0; i < m; i++) {
			c[i] = in.nextInt();
		}

		for (i = 0; i < m; i++) {
			cities[c[i]] = 1;
		}
//		for (i = 0; i < n; i++) {
//			System.out.print(cities[i] + " ");
//		}
//		System.out.println();
		for (i = 0; i < n; i++) {
			distance = 0;
			for (j = i, k = i;; j--, k++) {
				if (j<0) {
					j =0;
				}
				if(k==n){
					k=n-1;
				}
				if (cities[j] == 1 || cities[k] == 1) {
//					System.out.println(cities[j] + ":" + cities[k] + "-"
//							+ distance);
					break;
				}
				distance++;
			}
			if (max < distance) {
				max = distance;
			}
		}
		System.out.println(max);
	}
}
