package basics.searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		int i, index = -1;
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("enter element to search:");
		int element = sc.nextInt();
		for (i = 0; i < n; i++) {
			if (arr[i] == element) {
				index = i;
				break;
			}
		}
		if (index == -1)
			System.out.println("element not found.");
		else
			System.out.println("element found at index:" + index);

	}
}

// Time complexity: O(n)