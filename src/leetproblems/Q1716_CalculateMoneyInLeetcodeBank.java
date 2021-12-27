package leetproblems;

public class Q1716_CalculateMoneyInLeetcodeBank {
//	public int totalMoney(int n) {
//		int money = 0;
//		int week = 1, start = 1;
//		for (int i = 1; i <= n; ++i) {
//			money += start;
//			start++;
//			if (i % 7 == 0) {
//				week++;
//				start = week;
//			}
//		}
//		return money;
//	}

	public int totalMoney(int n) {
		int weeks = n / 7, day = n % 7;
		return 28 * weeks + 7 * weeks * (weeks - 1) / 2 + weeks * day + day * (day + 1) / 2;
	}
}
