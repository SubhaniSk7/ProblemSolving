package codechef.dsalearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class ZCO12001_MatchedBrackets {

	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] brackets = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			brackets[i] = Integer.parseInt(st.nextToken());

		bracketsPosition(brackets, n);
	}

	public static void bracketsPosition(int[] brackets, int n) {
		int depth = 0, maxNest = 0, maxNestPos = 0, len = 0, maxSeq = 0, maxSeqPos = 0, i;
		for (i = 0; i < n; i++) {
			if (brackets[i] == 1)
				depth++;
			else
				depth--;
			len++;
			if (maxNest < depth) {
				maxNest = depth;
				maxNestPos = i + 1;
			}

			if (depth == 0) {
				if (maxSeq < len) {
					maxSeq = len;
					maxSeqPos = i - len + 2;
				}
				len = 0;
			}
		}
		System.out.println(maxNest + " " + maxNestPos + " " + maxSeq + " " + maxSeqPos);
	}
}
