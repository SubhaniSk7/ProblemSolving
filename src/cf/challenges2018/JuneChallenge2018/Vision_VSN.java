package cf.challenges2018.JuneChallenge2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Vision_VSN {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int px, py, pz, qx, qy, qz, dx, dy, dz, cx, cy, cz, r;
		while (t > 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
			px = Integer.parseInt(tk.nextToken());
			py = Integer.parseInt(tk.nextToken());
			pz = Integer.parseInt(tk.nextToken());
			qx = Integer.parseInt(tk.nextToken());
			qy = Integer.parseInt(tk.nextToken());
			qz = Integer.parseInt(tk.nextToken());
			dx = Integer.parseInt(tk.nextToken());
			dy = Integer.parseInt(tk.nextToken());
			dz = Integer.parseInt(tk.nextToken());
			cx = Integer.parseInt(tk.nextToken());
			cy = Integer.parseInt(tk.nextToken());
			cz = Integer.parseInt(tk.nextToken());
			r = Integer.parseInt(tk.nextToken());

			System.out.println("px:" + px + "  py:" + py + "  pz:" + pz);
			System.out.println("qx:" + qx + "  qy:" + qy + "  qz:" + qz);
			System.out.println("dx:" + dx + "  dy:" + dy + "  dz:" + dz);

			System.out.println("cx:" + cx + "  cy:" + cy + "  cz:" + cz + "  r:" + r);

			System.out.println("------------------------------");
			double a = (double) (dx * dx + dy * dy + dz * dz);
			System.out.println("a: " + a);
			System.out.println("------------------------------");

			double b = (double) (2 * dx * (qx - cx) + 2 * dy * (qy - cy) + 2 * dz * (qz - cz));
			System.out.println(2 * dx * (qx - cx) + "+" + 2 * dy * (qy - cy) + "+" + 2 * dz * (qz - cz));
			System.out.println("b: " + b);
			System.out.println("------------------------------");

			double c = (double) (cx * cx + cy * cy + cz * cz + qx * qx + qy * qy + qz * qz
					- 2 * (cx * qx + cy * qy + cz * qz) - r * r);

			System.out.println(cx * cx + "+" + cy * cy + "+" + cz * cz + "+" + qx * qx + "+" + qy * qy + "+" + qz * qz
					+ "-" + 2 * (cx * qx + cy * qy + cz * qz) + "-" + r * r);
			System.out.println("c: " + c);

			double t1, t2;
			t1 = (double) (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			t2 = (double) (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

			System.out.println(t1 + " " + t2);
			t--;
		}
	}
}
