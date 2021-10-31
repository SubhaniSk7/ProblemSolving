package leetproblems;

public class Q1672_RichestCustomerWealth {
	public int maximumWealth(int[][] accounts) {
		int money = 0, customers = accounts.length, banks = accounts[0].length;
		for (int i = 0; i < customers; ++i) {
			int sum = 0;
			for (int j = 0; j < banks; ++j)
				sum += accounts[i][j];
			money = Math.max(money, sum);
		}
		return money;
	}
}
