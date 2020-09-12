package codechef.lunchTime.augustLunchTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EID2 {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()), i;

		while (t-- > 0) {
			int[] ages = new int[3];
			int[] gifts = new int[3];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (i = 0; i < 3; i++)
				ages[i] = Integer.parseInt(st.nextToken());
			for (i = 0; i < 3; i++)
				gifts[i] = Integer.parseInt(st.nextToken());

		}
	}
}
