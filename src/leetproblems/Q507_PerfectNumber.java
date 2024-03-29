package leetproblems;

public class Q507_PerfectNumber {
//	public boolean checkPerfectNumber(int num) {
//		int sum = 0;
//		for (int i = 2; i <= num / 2; ++i) {
//			if (num % i == 0)
//				sum += i;
//		}
//		return sum == num;
//	}

	public boolean checkPerfectNumber(int num) {
		if (num == 1)
			return false;
		int sum = 0;
		for (int i = 2; i <= Math.sqrt(num); ++i) {
			if (num % i == 0)
				sum += i + num / i;
		}
		sum++;
		return sum == num;
	}
}
