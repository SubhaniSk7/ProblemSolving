package codechefDSlearning;

import java.io.*;
import java.util.*;

public class SAVKONO_SaveKonoha {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), z = Integer.parseInt(st.nextToken());
			PriorityQueue<Integer> powers = new PriorityQueue<Integer>(Collections.reverseOrder());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				powers.add(Integer.parseInt(st.nextToken()));
			solution(n, z, powers);
		}
	}

	public static void solution(int n, int z, PriorityQueue<Integer> powers) {
		int attacks = 0;
		while (!powers.isEmpty() && z > 0) {
			int value = powers.poll().intValue();
			attacks++;
			z -= value;
			if (value / 2 != 0)
				powers.add(value / 2);
		}
		if (z <= 0)
			System.out.println(attacks);
		else
			System.out.println("Evacuate");
	}
}
