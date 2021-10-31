package interviewbit.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class JumpGameArray {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> jumps = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			jumps.add(Integer.parseInt(st.nextToken()));
		System.out.println(canJump(jumps));
	}

	public static int canJump(ArrayList<Integer> A) {
		int n = A.size(), target = n - 1;
		for (int i = n - 2; i >= 0; --i) {
			if (A.get(i) + i >= target)
				target = i;
		}
		if (target == 0)
			return 1;
		else
			return 0;
	}
}
