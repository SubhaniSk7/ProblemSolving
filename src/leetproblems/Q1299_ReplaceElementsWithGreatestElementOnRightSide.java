package leetproblems;

public class Q1299_ReplaceElementsWithGreatestElementOnRightSide {
	public int[] replaceElements(int[] arr) {
		int n = arr.length, max = -1;
		int[] result = new int[n];
		for (int i = n - 1; i >= 0; --i) {
			result[i] = max;
			if (max < arr[i])
				max = arr[i];
		}
		return result;
	}
}
