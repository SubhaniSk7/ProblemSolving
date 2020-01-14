package hr.Strings;

import java.util.Scanner;

public class GameOfThrones1 {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		String temp=str;
		
		int i,flag=0,len=0,j=0;
		int[] alphaCount=new int[26];
		
		for(i=97;i<=122;i++){
			
			if(temp.contains(""+(char)i)){
				alphaCount[j]=temp.length()-temp.replace(""+(char)i, "").length();
			}
			j++;
		}
		
		for(i=0;i<26;i++){
			
			if(alphaCount[i]%2==1){
				flag++;
			}
			if(flag>1){
				System.out.println("NO");
				break;
			}
		}
		if(flag<=1){
			System.out.println("YES");
		}
	}
}
