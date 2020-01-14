package hr.Implementation;

import java.util.Scanner;

public class TaumAndBDay {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int i;
		long[] result = new long[t];
		for (i = 0; i < t; i++) {
			long b = in.nextLong();
			long w = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();

			long amount = 0;
			if (x == y) {
				amount = (b * x) + (w * y);
			} else if (x > y) {
				if ((y + z) < x) {
					amount=(b*(y+z))+(w*y);
				} else if ((y + z) == x) {
					amount=(b*x)+(w*y);
				} else if ((y + z) > x) {
					amount=(b*x)+(w*y);
				}
			} else if (y > x) {
				if ((x + z) < y) {
					amount=(b*x)+(w*(x+z));
				} else if ((x + z) == y) {
					amount=(b*x)+(w*y);
				} else if ((x + z) > y) {
					amount=(b*x)+(w*y);
				}
			}
			result[i]=amount;
		}
		for(i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
}
