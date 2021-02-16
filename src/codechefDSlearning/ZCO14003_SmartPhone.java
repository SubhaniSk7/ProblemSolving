package codechefDSlearning;

import java.io.*;
import java.util.Arrays;

public class ZCO14003_SmartPhone {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		long budgets[] = new long[N];
		for (int i = 0; i < N; i++)
			budgets[i] = Integer.parseInt(br.readLine());
		System.out.println(bestPrice(budgets));
	}

	public static long bestPrice(long[] budgets) {
		long price = 0, profitPrice = 0, fixPrice, customers = 0;
		Arrays.parallelSort(budgets);
		for (int i = 0; i < budgets.length; i++) {
			fixPrice = budgets[i];
			customers = budgets.length - i;
			price = customers * fixPrice;
			if (profitPrice <= price)
				profitPrice = price;
		}
		return profitPrice;
	}
}
