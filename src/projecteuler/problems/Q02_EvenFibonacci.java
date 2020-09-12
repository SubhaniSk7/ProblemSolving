package projecteuler.problems;

public class Q02_EvenFibonacci {

	public static void main(String subhani[]) {

		int t1 = 0, t2 = 1, result = 0, sum;
		while (true) {
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			if (sum > 4000000)
				break;
			if (sum % 2 == 0)
				result += sum;
		}
		System.out.println(result);
		System.out.println();
		fib();
	}

	public static void fib() {
		int a = 2, b = 8, sum = 2, temp;

		while (b <= 4000000) {
			sum += b;
			temp = a;
			a = b;
			b = temp + 4 * b;// sum+=4 * E(n-1) + E(n-2)
		}
		System.out.println(sum);
	}
	
}
