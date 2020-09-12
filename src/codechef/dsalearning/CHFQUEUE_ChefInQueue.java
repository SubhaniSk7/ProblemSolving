package codechef.dsalearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class CHFQUEUE_ChefInQueue {

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

		int[] chefs = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			chefs[i] = Integer.parseInt(st.nextToken());
		fearfulness(chefs, n);
	}

//	public static void fearfulness(int[] chefs, int n) {
//		long totalFear = 1;
//		int i, j;
//
//		for (i = 0; i < n - 1; i++) {
//			for (j = i + 1; j < n; j++) {
//				if (chefs[j] < chefs[i]) {
//					int chefFear = (j + 1) - (i + 1) + 1;
//					totalFear = (totalFear * chefFear) % 1000000007;
//					break;
//				}
//			}
////			System.out.println(i + "-" + j);
//		}
//		System.out.println(totalFear);
//	}

	public static void fearfulness(int[] chefs, int n) {
		long totalFear = 1;
		int i;
		Stack<Integer> juniorIndex = new Stack<>();
		for (i = n - 1; i >= 0; i--) {
			while (!juniorIndex.empty() && chefs[juniorIndex.peek() - 1] >= chefs[i])
				juniorIndex.pop();
			if (juniorIndex.empty())
				totalFear *= 1;
			else {
				int chefFear = juniorIndex.peek() - (i + 1) + 1;
				totalFear = (totalFear * chefFear) % 1000000007;
			}
			juniorIndex.push(i + 1);
		}
		System.out.println(totalFear);
	}
}
