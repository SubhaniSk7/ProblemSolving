package codechefDSlearning;

import java.io.*;

public class PSHOT {

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			minWinShots(s, n);
		}
	}

	public static void minWinShots(String s, int n) {
		int winShot = 0, aCount = 0, bCount = 0, aRem = n, bRem = n;
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				aRem--;
				if (s.charAt(i) == '1')
					aCount++;
			}

			if (i % 2 == 1) {
				bRem--;
				if (s.charAt(i) == '1')
					bCount++;
			}
			winShot++;
			if (aCount > bRem + bCount || bCount > aRem + aCount)
				break;
		}
		System.out.println(winShot);
	}
}
