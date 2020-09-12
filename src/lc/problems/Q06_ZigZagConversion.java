package lc.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06_ZigZagConversion {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int rows = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String result = convert(s, rows);
		System.out.println(result);
	}

	public static String convert(String s, int numRows) {
		String result = "";

		String[] rowStrings = new String[numRows];
		int i, k;
		boolean up = false;
		for (i = 0; i < numRows; i++)
			rowStrings[i] = "";
		for (i = 0, k = 0; i < numRows && k < s.length(); k++) {
//			System.out.println(i);
			rowStrings[i] += s.charAt(k);
			if (up) {
				if (i == 0) {
					up = false;
					if (i != numRows - 1)
						i++;
				} else
					i--;
			} else {
				if (i == numRows - 1) {
					up = true;
					if (i != 0)
						i--;

				} else
					i++;
			}
//			printArray(rowStrings);
		}

		for (i = 0; i < numRows; i++)
			result += rowStrings[i];

		return result;
	}

	public static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " ");
		System.out.println("----------------------");
	}
}
