package hr.BitManipulation;

import java.math.BigInteger;
import java.util.Scanner;

public class FlippingBits {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(),i,k=0;

		BigInteger number;
		String binStr;

		BigInteger[] flipped=new BigInteger[t];
		
		while (t > 0) {

			number = sc.nextBigInteger();
			binStr = number.toString(2);
			if (binStr.length() < 32) {
				int suffixlength = 32 - binStr.length();
				while (suffixlength > 0) {
					binStr = "0" + binStr;
					suffixlength--;
				}

			}
			int length = binStr.length();
			i = 0;
			while (length > 0) {
				if (binStr.charAt(i) == '0') {
					binStr = binStr.substring(0, i) + '1'
							+ binStr.substring(i + 1);
				} else {
					binStr = binStr.substring(0, i) + '0'
							+ binStr.substring(i + 1);
				}
				i++;
				length--;
			}
			flipped[k]=new BigInteger(binStr,2);
			k++;
			t--;
		}
		
		for(i=0;i<flipped.length;i++){
			System.out.println(flipped[i]);
		}
	}
}
