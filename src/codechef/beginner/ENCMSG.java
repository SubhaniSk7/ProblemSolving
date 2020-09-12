package codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ENCMSG {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine()), i;
			String str = br.readLine();
			char[] ch = str.toCharArray();
			for (i = 0; i < n - 1 && i + 1 < n; i += 2) {
				char temp = ch[i];
				ch[i] = (char) (122 - (int) ch[i + 1] + 97);
				ch[i + 1] = (char) (122 - (int) temp + 97);
			}
			if (n % 2 != 0)
				ch[n - 1] = (char) (122 - (int) ch[n - 1] + 97);
			printArray(ch);
		}
	}

	public static void printArray(char[] ch) {
		for (int i = 0; i < ch.length; i++)
			System.out.print(ch[i]);
		System.out.println();
	}
}
