package leetproblems;

public class Q733_FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr][sc];
		if (color == newColor)
			return image;
		traverse(image, sr, sc, color, newColor);
		return image;
	}

	public void traverse(int[][] image, int r, int c, int color, int newColor) {
		if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != color)
			return;
		image[r][c] = newColor;
		traverse(image, r + 1, c, color, newColor);
		traverse(image, r - 1, c, color, newColor);
		traverse(image, r, c + 1, color, newColor);
		traverse(image, r, c - 1, color, newColor);
	}
}
