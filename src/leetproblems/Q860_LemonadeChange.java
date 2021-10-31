package leetproblems;

public class Q860_LemonadeChange {
	public boolean lemonadeChange(int[] bills) {
		int n = bills.length, fives = 0, tens = 0;
		for (int i = 0; i < n; ++i) {
			if (bills[i] == 5)
				fives++;
			else if (bills[i] == 10) {
				tens++;
				fives--;
			} else if (tens > 0) {
				tens--;
				fives--;
			} else
				fives -= 3;
			if (fives < 0)
				return false;
		}
		return true;
	}
}
