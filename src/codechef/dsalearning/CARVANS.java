package codechef.dsalearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CARVANS {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] speeds = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				speeds[i] = Integer.parseInt(st.nextToken());
			maxCars(speeds);
		}
	}

	public static void maxCars(int[] speeds) {

		int count = 0, i, j;

		for (i = 0; i < speeds.length; i++) {
			boolean high = true;
			for (j = 0; j < i; j++) {
				if (speeds[i] > speeds[j]) {
					high = false;
					break;
				}
			}
			if (high)
				count++;
		}
		System.out.println(count);
	}

}
