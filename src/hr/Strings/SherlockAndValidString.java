package hr.Strings;

import java.util.Scanner;

public class SherlockAndValidString {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int[] frequency = new int[26];
		int i, temp = 0,min=Integer.MAX_VALUE,minCount=0,flag=0;
		for (i = 97; i <= 122; i++) {
			if (str.contains("" + (char) i)) {
				temp = str.length() - str.replace("" + (char) i, "").length();
				frequency[i - 97] = temp;
				if(min==frequency[i-97]){
					minCount++;
				}
				if(min>frequency[i-97]){
					min=frequency[i-97];
				}
			}
		}
		for (i = 0; i < frequency.length; i++) {
			System.out.print(frequency[i] + " ");
			if(frequency[i]==0)
				frequency[i]=-1;
		}
		System.out.println();
		System.out.println(min+" "+minCount);
		
		for (i = 0; i < frequency.length; i++) {
			if(frequency[i]==-1){
				continue;
			}
			
		}
		
	}
}
