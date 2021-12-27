package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ASHIGIFT_SavingAGiftOfLove {

	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			int X = Integer.parseInt(br.readLine());
			long totalMen = 1;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int B = Integer.parseInt(st.nextToken());
			long[][] dishes = new long[B][2];
			for (int i = 0; i < B; ++i) {
				dishes[i][0] = Long.parseLong(st.nextToken());
				dishes[i][1] = Long.parseLong(st.nextToken());
				totalMen += dishes[i][1];
			}
			st = new StringTokenizer(br.readLine());
			int C = Integer.parseInt(st.nextToken());
			long[][] clans = new long[C][3];
			for (int i = 0; i < C; ++i) {
				clans[i][0] = Long.parseLong(st.nextToken());// p_i
				clans[i][1] = Long.parseLong(st.nextToken());// q_i
				clans[i][2] = Long.parseLong(st.nextToken());// r_i
			}

			long result = totalMen;
			if (C != 0) {
				long start = 0, end = totalMen, men = 0;
				while (start <= end) {
					long mid = start + (end - start) / 2;
					men = mid;
					int i = 0, j = 0;
					while (i < B && j < C) {
						if (dishes[i][0] < clans[j][0]) {
							men -= dishes[i][1];
							i++;
						} else {
							if (men >= clans[j][1])
								men += clans[j][2];
							j++;
						}
						if (men < 0)
							break;
					}
					while (i < B) {
						men -= dishes[i][1];
						i++;
						if (men < 0)
							break;
					}

					if (men > 0) {
						result = mid;
						end = mid - 1;
					} else if (men == 0) {
						result = mid + 1;
						break;
					} else
						start = mid + 1;
				}
			}
			sb.append(result + "\n");
		}
		System.out.println(sb);
	}
}
