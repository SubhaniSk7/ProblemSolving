package codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PLAYSTR {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			String str1 = br.readLine(), str2 = br.readLine();

			countSetBits(n, str1, str2);
		}
	}

	public static void countSetBits(int n, String str1, String str2) {

		int count1 = 0, count2 = 0;
		for (int i = 0; i < str2.length(); i++) {
			if (str1.charAt(i) == '1')
				count1++;
			if (str2.charAt(i) == '1')
				count2++;
		}
		if (count1 == count2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
