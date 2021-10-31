package leetproblems;

public class Q832_FlippingAnImage {
	public int[][] flipAndInvertImage(int[][] image) {
		int n = image.length, col;
		if (n % 2 == 0)
			col = (n - 1) / 2;
		else
			col = n / 2;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j <= col; ++j) {
				int temp = 1 - image[i][j];
				image[i][j] = 1 - image[i][n - j - 1];
				image[i][n - j - 1] = temp;
			}
		}
		return image;
	}
}
