package hr.Sorting;

import java.util.Scanner;

public class InsertionPart1 {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] ar = new int[n];
		int i;
		for (i = 0; i < n; i++)
			ar[i] = sc.nextInt();
		insertIntoSorted(ar);
	}

	public static void insertIntoSorted(int[] ar) {
		
		int i, j;
		int value = ar[ar.length - 1];

		i = ar.length - 2;
		while (i >= 0 && ar[i] >= value) {

			ar[i + 1] = ar[i];
			for (j = 0; j < ar.length; j++) {
				System.out.print(ar[j]);
				if (j + 1 < ar.length)
					System.out.print(" ");
			}
			System.out.println();
			i--;
		}

		ar[i + 1] = value;

		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
