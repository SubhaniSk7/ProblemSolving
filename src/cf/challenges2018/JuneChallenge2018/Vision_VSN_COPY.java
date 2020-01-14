package cf.challenges2018.JuneChallenge2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Vision_VSN_COPY {
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

			double angle;
			double prod = (px * qx) + (py * qy) + (pz * qz);
			double denProd = Math.sqrt(px * px + py * py + pz * pz) * Math.sqrt(qx * qx + qy * qy + qz * qz);

			// angle = Math.acos(prod / denProd) * (180 / Math.PI);
			angle = prod / denProd;

			System.out.println(prod + " " + denProd + " " + angle);

			t--;
		}
	}
}
