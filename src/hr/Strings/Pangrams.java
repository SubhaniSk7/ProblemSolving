package hr.Strings;

import java.util.Scanner;

public class Pangrams {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase().replaceAll(" ","");
		
		int i,j=97,flag=0;
		char[] alpha=new char[26];
		
		for(i=0;i<26;i++){
			alpha[i]=(char)j;
			j++;
		}
		i=0;
		while(i<26){
			if(!str.contains(""+alpha[i])){
				
				flag=0;
				break;
			}
			else{
				flag=1;
			}
			i++;
		}
		if(flag==0){
			System.out.println("not pangram");
		}
		else{
			System.out.println("pangram");
		}
	}
}
