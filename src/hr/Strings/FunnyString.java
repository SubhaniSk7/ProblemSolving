package hr.Strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt(),i,j,strlength,flag=0,first,second;
		String[] str=new String[t];
		String[] rev=new String[t];
		
		for(i=0;i<t;i++){
			str[i]=sc.next();
		}
		
		for(i=0;i<t;i++){
			strlength=str[i].length();
			for(j=1;j<str[i].length();j++){
				
				first=Math.abs((int)str[i].charAt(j)-(int)str[i].charAt(j-1));
				second=Math.abs((int)str[i].charAt(strlength-j)-(int)str[i].charAt(strlength-j-1));
				
				if(first==second){
					flag=0;
				}
				if(first != second){
					flag=1;
					
					break;
				}
			}
			if(flag==0){
				System.out.println("Funny");
			}
			else{
				System.out.println("Not Funny");
			}
		}
		
	}
}
