package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PerformStringShifts {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		ArrayList<ArrayList<Integer>> shift = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(Integer.parseInt(st.nextToken()));
			al.add(Integer.parseInt(st.nextToken()));
			shift.add(al);
		}
		PerformStringShifts obj = new PerformStringShifts();
		System.out.println(obj.stringShift(s, shift));
	}

	public String stringShift(String s, ArrayList<ArrayList<Integer>> shift) {
		int n = s.length(), amount = 0;
		for (ArrayList<Integer> al : shift) {
			if (al.get(0) == 0)
				amount -= al.get(1);
			else
				amount += al.get(1);
		}
		amount %= n;
		if (amount < 0)
			amount += n;
		return s.substring(n - amount) + s.substring(0, n - amount);
	}
}
