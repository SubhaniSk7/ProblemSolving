package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P4C_RegistrationSystem {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] names = new String[n];
		for (int i = 0; i < n; ++i)
			names[i] = br.readLine();
		solution(n, names);
	}

	public static void solution(int n, String[] names) {
		HashMap<String, Integer> db = new HashMap<String, Integer>();
		for (int i = 0; i < n; ++i) {
			if (db.containsKey(names[i])) {
				String user = names[i] + db.get(names[i]);
				db.put(user, 1);
				db.put(names[i], db.get(names[i]) + 1);
				System.out.println(user);
			} else {
				db.put(names[i], 1);
				System.out.println("OK");
			}
		}
	}
}
