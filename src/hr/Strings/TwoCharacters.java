package hr.Strings;

import java.util.Scanner;

public class TwoCharacters {
	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int i, j = 0;
		char[] alpha = new char[26];
		for (i = 97; i < 123; i++) {
			alpha[j] = (char) i;
			j++;
		}
		int[] alphaCount = new int[26];
		for (i = 0; i < 26; i++) {
			if (s.contains("" + alpha[i])) {
				String temp = s;
				alphaCount[i] = s.length()- temp.replace("" + alpha[i], "").length();
			}
		}
		for (i = 0; i < 26; i++) {
			System.out.print(alphaCount[i] + " ");
		}
		
		for(i=0;i<26;i++){

			System.out.println("char:"+alpha[i]);
			for(j=0;j<s.length()-1;j++){
				if(alpha[i]==s.charAt(j) && alpha[i]==s.charAt(j+1)){
					s=s.replace(""+s.charAt(j), "");
					System.out.println(s);
				}
			}
			System.out.println("i:"+i+" s:"+s);
		}
		
	}
}
