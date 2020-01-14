package hr.Sorting;

import java.util.Scanner;

public class CountingSort3 {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i, max = -1;
		int[] numbers = new int[n];
		String[] string = new String[n];
		for (i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
			string[i] = sc.next();
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}

		int[] count = new int[max + 1];
		for (i = 0; i < n; i++) {
			count[numbers[i]] += 1;
		}
		for (i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		int[] result = new int[100];
		for (i = 0; i < 100; i++) {
			if (i >= count.length)
				result[i] = result[i - 1];
			else
				result[i] = count[i];
		}
		for (i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}
}