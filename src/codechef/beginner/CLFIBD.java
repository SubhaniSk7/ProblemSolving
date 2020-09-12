package codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CLFIBD {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String str = br.readLine();
			fibonacciString(str);
		}
	}

	public static void fibonacciString(String s) {

		if (s.length() < 3)
			System.out.println("Dynamic");
		else {
			int[] freq = new int[26];
			char[] ch = s.toCharArray();
			int i;
			for (i = 0; i < ch.length; i++)
				freq[ch[i] - 'a'] += 1;

			Arrays.sort(freq);
			int count = 0;
			boolean present1 = false, present2 = false;
			for (i = 0; i < freq.length; i++) {
				if (freq[i] == 0)
					continue;
				count++;
				if (count <= 2)
					continue;
				if (freq[i] != freq[i - 1] + freq[i - 2]) {
					present1 = false;
					break;
				} else
					present1 = true;
			}
			count = 0;
			for (i = 0; i < freq.length; i++) {
				if (freq[i] == 0)
					continue;
				count++;
				if (count == 1)
					continue;
				if (count == 2) {// first two chars might be in reverse order
					int temp = freq[i];
					freq[i] = freq[i - 1];
					freq[i - 1] = temp;
					continue;
				}
				if (freq[i] != freq[i - 1] + freq[i - 2]) {
					present2 = false;
					break;
				} else
					present2 = true;
			}

			if (present1 || present2)
				System.out.println("Dynamic");
			else
				System.out.println("Not");
		}
	}
}
