package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q08_StringToIntegerAtoI {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(myAtoi(str));
	}

	public static int myAtoi(String str) {
		String value = "";
		int i;
		str = str.trim();
		if (str.length() == 0 || Character.isAlphabetic(str.charAt(0))) {
			return Integer.parseInt("0");
		} else if (str.charAt(0) == '+' || str.charAt(0) == '-') {
			value += str.charAt(0);
			for (i = 1; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i)))
					value += str.charAt(i);
				else
					break;
			}
		} else {
			for (i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i)))
					value += str.charAt(i);
				else
					break;
			}
		}
		if (value.equals("+") || value.equals("-") || value.length() == 0)
			return 0;
		else if (new BigInteger("" + value).compareTo(new BigInteger("" + Integer.MIN_VALUE)) < 0)
			return Integer.MIN_VALUE;
		else if (new BigInteger("" + value).compareTo(new BigInteger("" + Integer.MAX_VALUE)) > 0)
			return Integer.MAX_VALUE;
		else
			return Integer.parseInt(value);
	}
}
