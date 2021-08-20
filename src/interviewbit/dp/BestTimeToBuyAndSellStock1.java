package interviewbit.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BestTimeToBuyAndSellStock1 {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> prices = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			prices.add(Integer.parseInt(st.nextToken()));
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(final List<Integer> A) {// buy atmost 1 time, sell atmost 1 time
		int n = A.size(), max = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; ++i) {
			if (A.get(i) < min)
				min = A.get(i);
			else
				max = Math.max(max, A.get(i) - min);
		}
		return max;
	}
}
