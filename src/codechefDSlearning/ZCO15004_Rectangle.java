package codechefDSlearning;

import java.io.*;
import java.util.*;

public class ZCO15004_Rectangle {
	int x, y;

	public ZCO15004_Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		ArrayList<ZCO15004_Rectangle> points = new ArrayList<ZCO15004_Rectangle>();
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			ZCO15004_Rectangle p = new ZCO15004_Rectangle(Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()));
			points.add(p);
		}
		solution(n, points);
	}

	public static void solution(int n, ArrayList<ZCO15004_Rectangle> points) {
		int xLimit = 100000, yLimit = 500;
		points.add(new ZCO15004_Rectangle(0, 0));
		points.add(new ZCO15004_Rectangle(xLimit, 0));
		for (int i = 1; i < xLimit; ++i)
			points.add(new ZCO15004_Rectangle(i, 500));
		Collections.sort(points, (a, b) -> ((Integer) a.x).compareTo(b.x));

		int[] leftX = new int[3 * xLimit], rightX = new int[3 * xLimit];
		Arrays.fill(leftX, -1);
		Arrays.fill(rightX, -1);
		int l = points.size();

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < l; ++i) {
			int x = points.get(i).x, y = points.get(i).y;
			while (!stack.isEmpty() && points.get(stack.peek()).y > y) {
				rightX[stack.peek()] = x;
				stack.pop();
			}
			stack.push(i);
		}
		stack.clear();

		for (int i = l - 1; i >= 0; --i) {
			int x = points.get(i).x, y = points.get(i).y;
			while (!stack.isEmpty() && points.get(stack.peek()).y > y) {
				leftX[stack.peek()] = x;
				stack.pop();
			}
			stack.push(i);
		}

		int maxArea = 0;
		for (int i = 0; i < l; ++i) {
			int x = points.get(i).x, y = points.get(i).y;
			if (leftX[i] != -1 && rightX[i] != -1 && leftX[i] != x && rightX[i] != x)
				maxArea = Math.max(maxArea, (rightX[i] - leftX[i]) * y);
		}
		System.out.println(maxArea);
	}
}
