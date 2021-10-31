package leetproblems;

public class Q941_ValidMountainArray {
	public boolean validMountainArray(int[] arr) {
		int n = arr.length, i = 0;
		while (i < n && i + 1 < n && arr[i] < arr[i + 1])
			i++;
		if (i == 0 || i + 1 >= n)
			return false;
		while (i < n && i + 1 < n) {
			if (arr[i] <= arr[i + 1])
				return false;
			i++;
		}
		return true;
	}
}
