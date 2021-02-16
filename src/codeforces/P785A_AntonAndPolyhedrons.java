package codeforces;

import java.io.*;

public class P785A_AntonAndPolyhedrons {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] polyhedrons = new String[n];
		for (int i = 0; i < n; ++i)
			polyhedrons[i] = br.readLine();
		solution(n, polyhedrons);
	}

	public static void solution(int n, String[] polyhedrons) {
		int faces = 0;
		for (int i = 0; i < n; ++i) {
			if (polyhedrons[i].equals("Tetrahedron"))
				faces += 4;
			else if (polyhedrons[i].equals("Cube"))
				faces += 6;
			else if (polyhedrons[i].equals("Octahedron"))
				faces += 8;
			else if (polyhedrons[i].equals("Dodecahedron"))
				faces += 12;
			else if (polyhedrons[i].equals("Icosahedron"))
				faces += 20;
		}
		System.out.println(faces);
	}
}
