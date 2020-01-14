package gfg.algos.Bit;

public class MultiTwoNumShiftOper {

	public static void main(String subhani[]) {
		int n = 20, m = 13;
		System.out.print(multiply(n, m));
	}

	static int multiply(int n, int m) {
		int ans = 0, count = 0;
		while (m > 0) {
			// check for set bit and left shift n, count times
			if (m % 2 == 1) {
				ans += n << count;
				System.out.println("->" + ans);
			}

			count++;// increment of place value (count)
			m /= 2;
			System.out.println("::" + m);
		}

		return ans;
	}
}
