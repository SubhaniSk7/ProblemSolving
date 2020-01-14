package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMultipleOf3 {

	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()), j = 0;
		int[] result = new int[t];
		while (t-- > 0) {
			String n = br.readLine();
			result[j++] = isStringMultipleOf3(n);
		}
		for (j = 0; j < result.length; j++)
			System.out.println(result[j]);
	}

	static int isStringMultipleOf3(String n) {
		int i, evenDigitCount = 0, oddDigitCount = 0, counter = 0;
		for (i = n.length() - 1; i >= 0; i--) {
			if (counter % 2 == 0 && n.charAt(i) == '1')
				oddDigitCount++;
			else if (counter % 2 != 0 && n.charAt(i) == '1')
				evenDigitCount++;
			counter++;
		}
		return Math.abs(oddDigitCount - evenDigitCount) % 3 == 0 ? 1 : 0;
	}
}
