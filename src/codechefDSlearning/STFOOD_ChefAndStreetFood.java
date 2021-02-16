package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class STFOOD_ChefAndStreetFood {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			int[][] food = new int[n][3];
			StringTokenizer st;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 3; j++)
					food[i][j] = Integer.parseInt(st.nextToken());
			}

			hotelFood(food);
		}
	}

	public static void hotelFood(int[][] food) {
		int maxProfit = 0;
		for (int i = 0; i < food.length; i++) {
			int value = (food[i][1] / ((food[i][0] + 1))) * food[i][2];
			if (maxProfit < value)
				maxProfit = value;
		}

		System.out.println(maxProfit);
	}
}
