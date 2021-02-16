package codechefDSlearning;

import java.io.IOException;
import java.util.Scanner;

public class CONFLIP {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int G = sc.nextInt();
			for (int round = 0; round < G; round++) {
				int I = sc.nextInt();
				int N = sc.nextInt();
				int Q = sc.nextInt();

				flipsCount(I, N, Q);
			}
		}
	}

	public static void flipsCount(int I, int N, int Q) {
		if (N % 2 == 0)
			System.out.println(N / 2);
		else {
			if (Q == I)
				System.out.println(N / 2);
			else
				System.out.println((N / 2) + 1);
		}
	}
}
