package hr.Implementation;

import java.util.Scanner;

public class MinMaxSum {

	public static void main(String subhani[]) {
		Scanner in = new Scanner(System.in);

		long a = in.nextLong();
		long min=a, max=a;
		long total = a;
		for (int i = 0; i < 4; i++) {
			a = in.nextLong();
			total += a;
			if (min > a)
				min = a;
			if (max < a)
				max = a;
		}

		System.out.println((total - max) + " " + (total - min));
	}
}
