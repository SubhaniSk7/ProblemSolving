package gfg.PracticeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class LargestEvenNumber {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(), i;
		String[] numbers = new String[t];
		for (i = 0; i < t; i++)
			numbers[i] = sc.next();

		int j, digit, last = 0;
		for (i = 0; i < t; i++) {
			int[] arr = countDigits(numbers[i]);
			int eCount = evenCount(arr), oCount = arr.length - eCount;

			String result = "";
			for (j = arr.length - 1; j >= 0; j--) {
				digit = arr[j];
				if (arr[j] % 2 == 0 && eCount == 1) {
					last = digit;
					continue;
				}
				if (arr[j] % 2 == 0)
					eCount--;
				result += digit;
			}
			if (oCount != arr.length)
				result += last;
			System.out.println(result);
		}

	}

	public static int[] countDigits(String n) {
		int[] digits = new int[n.length()];
		int i;
		for (i = 0; i < n.length(); i++)
			digits[i] = Integer.parseInt("" + n.charAt(i));
		Arrays.sort(digits);
		return digits;
	}

	public static void printArray(int[] arr) {
		System.out.println("sorted");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static int evenCount(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 0)
				count++;
		return count;
	}
}

// 284918227595347128185772596567355423933679973674289434574127522843135379266
// 282117167484252498399472768872167158754489584693219247181946832634499515
