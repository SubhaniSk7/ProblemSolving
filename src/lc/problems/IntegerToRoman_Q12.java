package lc.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerToRoman_Q12 {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		System.out.println(roman(n));
	}

	public static String roman(int num) {

		int count = 0, digit;
		String roman = "", temp = "";

		String[] arr = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL", "L", "LX",
				"LXX", "LXXX", "XC", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M" };

		while (num > 0) {
			digit = num % 10;
			if (count == 3)
				break;
			if (digit == 0)
				temp = "";
			else {
				if (count == 0)
					temp = arr[digit];
				if (count == 1)
					temp = arr[digit + 9];
				if (count == 2)
					temp = arr[digit + 18];
			}
			roman = temp + roman;
			num = num / 10;
			count++;
		}
		temp = "";
		if (count == 3) {
			for (int i = 0; i < num; i++)
				temp += "M";
			roman = temp + roman;
		}
		return roman;
	}
}
