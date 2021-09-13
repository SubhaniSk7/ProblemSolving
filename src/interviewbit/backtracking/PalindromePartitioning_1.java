package interviewbit.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PalindromePartitioning_1 {

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		result = partition(s);
		print(n, result);
	}

	public static ArrayList<ArrayList<String>> partition(String a) {
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		ArrayList<String> temp = new ArrayList<>();
		result = part(a, result, temp, 0);
		return result;
	}

	public static ArrayList<ArrayList<String>> part(String s, ArrayList<ArrayList<String>> result,
			ArrayList<String> temp, int index) {
		int n = s.length();
		String str = "";
		ArrayList<String> cur = new ArrayList<>(temp);
//		if (index == 0)
//			temp.clear();
		for (int i = index; i < n; ++i) {
			str = str + s.charAt(i);
			if (isPalindrome(str)) {
				temp.add(str);
				if (i + 1 < n)
					result = part(s, result, temp, i + 1);
				else
					result.add(temp);
				temp = new ArrayList<>(cur);
			}
		}
		return result;
	}

	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void print(int n, ArrayList<ArrayList<String>> result) {
		for (int i = 0; i < result.size(); ++i)
			System.out.println(result.get(i).toString());
	}

}
