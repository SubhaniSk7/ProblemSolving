package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q258_AddDigits {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		System.out.println(addDigits(num));
	}

	public static int addDigits(int num) {
		if (num == 0)
			return 0;
		int ans = num % 9;
		return ans == 0 ? 9 : ans;
	}
}
