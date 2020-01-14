package hr.Implementation;

import java.util.Scanner;

public class ACMICPSTeam {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i, j, k, x = 0, max = Integer.MIN_VALUE,count=0,knowntopics=Integer.MIN_VALUE;
		String[] topic = new String[n];
		for (i = 0; i < n; i++) {
			topic[i] = sc.next();
		}
		
		for (i = 0; i < n-1; i++) {
			for (j = i+1; j < n; j++) {
				if(i==j)
					continue;
				knowntopics=0;
				for (k = 0; k < m; k++) {
					if (topic[i].charAt(k)=='1' || topic[j].charAt(k) == '1') {
						knowntopics++;
					}
				}
				if (knowntopics >max) {
					max=knowntopics;
					count=1;
				}
				else if(knowntopics==max){
					count++;
				}
			}
		}
		System.out.println(max+"\n"+count);
	}
}
