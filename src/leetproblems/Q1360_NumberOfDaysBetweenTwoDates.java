package leetproblems;

public class Q1360_NumberOfDaysBetweenTwoDates {
	public int daysBetweenDates(String date1, String date2) {
		String[] s1 = date1.split("-"), s2 = date2.split("-");
		int y1 = Integer.parseInt(s1[0]), m1 = Integer.parseInt(s1[1]), d1 = Integer.parseInt(s1[2]), y2 = Integer.parseInt(s2[0]), m2 = Integer.parseInt(s2[1]), d2 = Integer.parseInt(s2[2]);

		return Math.abs(daysFromStart(y1, m1, d1) - daysFromStart(y2, m2, d2));
	}

	public int daysFromStart(int y, int m, int d) {
		int total = d;
		for (int i = 1971; i < y; ++i)
			total += (leapYear(i) ? 366 : 365);
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < m - 1; ++i)
			total += days[i];
		if (m > 2 && leapYear(y))
			++total;
		return total;
	}

	public boolean leapYear(int y) {
		return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
	}
}
