package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TEST {

	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		do {
			System.out.println(n);
			try {
				st = new StringTokenizer(br.readLine());
				n = Integer.parseInt(st.nextToken());
			} catch (Exception e) {
			}
		} while (n != 42);
	}
}
