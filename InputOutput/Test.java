import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

import leetproblems.Q1528_ShuffleString;

public class Test {
	public static BufferedReader br;
	public static PrintStream out;

	public static void main(String[] subhani) throws IOException {
		br = new BufferedReader(new FileReader("F:\\Git Space\\CompetitiveCoding\\InputOutput\\in1.txt"));
		boolean append = false, autoFlush = true;
		out = new PrintStream(new FileOutputStream("F:\\Git Space\\CompetitiveCoding\\InputOutput\\out1.txt", append), autoFlush);

		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		int[] indices = new int[s.length()];
		for (int i = 0; i < s.length(); ++i)
			indices[i] = Integer.parseInt(st.nextToken());
		Q1528_ShuffleString obj = new Q1528_ShuffleString();
		String res = obj.restoreString(s, indices);
		out.print(res);
	}
}
