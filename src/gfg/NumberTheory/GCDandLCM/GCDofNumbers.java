package gfg.NumberTheory.GCDandLCM;

import java.util.Arrays;
import java.util.Scanner;

public class GCDofNumbers {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of numbers:");
		int n = sc.nextInt(), i;

		int[] a = new int[n];
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		Arrays.sort(a);// sorting array
		int result = a[0];
		for (i = 1; i < n; i++) {
			result = gcd(result, a[i]);
		}
		System.out.println("gcd:" + result);
	}

	public static int gcd(int a, int b) {

		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
}
