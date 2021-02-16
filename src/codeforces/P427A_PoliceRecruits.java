package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P427A_PoliceRecruits {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] events = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			events[i] = Integer.parseInt(st.nextToken());
		solution(n, events);
	}

	public static void solution(int n, int[] events) {
		int crimes = 0, officers = 0;
		for (int i = 0; i < n; ++i) {
			if (events[i] != -1)
				officers += events[i];
			else if (events[i] == -1 && officers == 0)
				crimes++;
			else
				officers--;
		}
		System.out.println(crimes);
	}
}
