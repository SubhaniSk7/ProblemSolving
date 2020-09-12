package codechef.dsalearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LADDU {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int acts = Integer.parseInt(st.nextToken());
			String origin = st.nextToken();
			String[] activities = new String[acts];
			for (int i = 0; i < acts; ++i)
				activities[i] = br.readLine();

			months(activities, origin);
		}
	}

	public static void months(String[] activities, String origin) {
		int i, laddus = 0;
		for (i = 0; i < activities.length; ++i) {
			String s[] = activities[i].split(" ");
			if (s[0].equals("CONTEST_WON")) {
				int rank = Integer.parseInt(s[1]);
				laddus += 300;
				if (rank <= 20)
					laddus += 20 - rank;
			} else if (s[0].equals("TOP_CONTRIBUTOR")) {
				laddus += 300;
			} else if (s[0].equals("BUG_FOUND")) {
				int severity = Integer.parseInt(s[1]);
				laddus += severity;
			} else {
				laddus += 50;
			}

		}
		if (origin.equals("INDIAN"))
			System.out.println(laddus / 200);
		else
			System.out.println(laddus / 400);
	}
}
