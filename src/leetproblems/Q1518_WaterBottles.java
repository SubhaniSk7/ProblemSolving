package leetproblems;

public class Q1518_WaterBottles {
	public int numWaterBottles(int numBottles, int numExchange) {
		int full = numBottles, empty = 0, bottles = 0;
		while (full > 0) {
			bottles += full;
			empty += full;

			full = empty / numExchange;
			empty = empty % numExchange;
		}
		return bottles;
	}
}
