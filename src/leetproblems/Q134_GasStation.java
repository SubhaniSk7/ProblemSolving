package leetproblems;

public class Q134_GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int n = gas.length;
		int totalGas = 0, totalCost = 0;
		int[] diff = new int[n];
		for (int i = 0; i < n; ++i) {
			totalGas += gas[i];
			totalCost += cost[i];
			diff[i] = gas[i] - cost[i];
		}
		if (totalGas - totalCost < 0)
			return -1;

		int index = 0, total = 0;
		for (int i = 0; i < n; ++i) {
			total += diff[i];
			if (total < 0) {
				total = 0;
				index = i + 1;
			}
		}
		return index;
	}
}
