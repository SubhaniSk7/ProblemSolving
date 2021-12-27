package leetproblems;

public class Q1154_DayOfTheYear {
	public int dayOfYear(String date) {
		String[] s = date.split("-");
		int y = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]), d = Integer.parseInt(s[2]);
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (m > 2 && leapYear(y))
			++d;
		for (int i = 0; i < m - 1; ++i)
			d += days[i];
		return d;
	}

	public boolean leapYear(int y) {
		return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
	}
}
