package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4A_Watermelon {

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int w = Integer.parseInt(br.readLine());
		if (w % 2 != 0 || w == 2)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
