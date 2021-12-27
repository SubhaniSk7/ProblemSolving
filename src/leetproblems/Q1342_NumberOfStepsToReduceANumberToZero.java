package leetproblems;

public class Q1342_NumberOfStepsToReduceANumberToZero {
//	public int numberOfSteps(int n) {
//		int count = 0;
//		while (n > 0) {
//			if (n % 2 == 0)
//				n /= 2;
//			else
//				n--;
//			count++;
//		}
//		return count;
//	}

	public int numberOfSteps(int n) {
		int count = 0;
		if (n == 0)
			return 0;
		while (n > 0) {
			count += ((n & 1) > 0) ? 2 : 1;
			n >>= 1;
		}
		return count - 1;
	}
}
