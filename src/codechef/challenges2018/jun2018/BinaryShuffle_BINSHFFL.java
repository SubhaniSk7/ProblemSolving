package codechef.challenges2018.jun2018;

import java.math.BigInteger;
import java.util.Scanner;

public class BinaryShuffle_BINSHFFL {

	public static void main(String subhani[]) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int i, aOnes = 0, bOnes = 0;
		while (t > 0) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();

			String aBin = getBinary(a), bBin = getBinary(b);
			System.out.println(aBin + "  " + bBin);
			String zero = "";
			for (i = 0; i < Math.abs(bBin.length() - aBin.length()); i++) {
				zero += "0";
			}
			if (aBin.length() < bBin.length()) {
				aBin = zero + aBin;
			} else if (aBin.length() > bBin.length()) {
				bBin = zero + bBin;
			}
			System.out.println("count:" + aBin + "  " + bBin);

			for (i = 0; i < aBin.length(); i++) {
				if (aBin.charAt(i) == '1')
					aOnes += 1;
				if (bBin.charAt(i) == '1')
					bOnes += 1;
			}
			System.out.println("setBits:" + aOnes + " " + bOnes);

			t--;
		}

	}

	public static String getBinary(BigInteger num) {

		String aBin = "";
		BigInteger remainder, two = new BigInteger("2");
		while (num.compareTo(BigInteger.ZERO) > 0) {
			remainder = num.mod(two);
			num = num.divide(two);
			aBin = remainder + aBin;
		}
		return aBin;
	}

	public static int countSetBits(BigInteger num) {
		int count = 0;

		while (num.compareTo(BigInteger.ZERO) > 0) {

		}
		return count;

	}
}
