package hr.Strings;

import java.util.Scanner;

public class StringConstruction {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		int i, j, cost = 0;
		int[] totalcost = new int[n];

		for (i = 0; i < n; i++) {
			str[i] = sc.next();
			str[i] = str[i].toLowerCase();

			cost = 0;
			for (j = 97; j < 123; j++) {
				if (str[i].contains(""+(char)j))
					cost += 1;
			}
			totalcost[i] += cost;
		}

		for (i = 0; i < n; i++) {
			System.out.println(totalcost[i]);
		}

	}
}
