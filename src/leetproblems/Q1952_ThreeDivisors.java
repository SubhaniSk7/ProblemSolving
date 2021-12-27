package leetproblems;

public class Q1952_ThreeDivisors {
	public boolean isThree(int n) {
		if (n == 1)
			return false;
		int count = 2;
		for (int i = 2; i <= n / 2; ++i) {
			if (n % i == 0)
				count++;
			if (count > 3)
				return false;
		}
		return count == 3;
	}
}
