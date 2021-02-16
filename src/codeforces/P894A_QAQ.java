package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P894A_QAQ {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		sol(s);
	}

	public static void sol(String s) {
		int n = s.length(), count = 0;
		for (int i = 0; i < n; ++i)
			for (int j = i + 1; j < n; ++j)
				for (int k = j + 1; k < n; ++k)
					if (s.charAt(i) == 'Q' && s.charAt(j) == 'A' && s.charAt(k) == 'Q')
						count++;
		System.out.println(count);
	}
}
