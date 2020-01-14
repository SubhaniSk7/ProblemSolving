package hr.Strings;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String subhani[]){
		Scanner sc=new Scanner(System.in);
		
		int c=sc.nextInt();
		String str1;
		String str2;
		int i,flag=0,x=0;
		String[] result=new String[c];
		
		while(c>0){
			flag=0;
			str1=sc.next();
			str2=sc.next();
			for(i=97;i<123;i++){
				
				if(str1.contains(""+(char)i) && str2.contains(""+(char)i)){
					flag=0;
					break;
				}
				else{
					flag=1;
				}
			}
			
			if(flag==0){
				result[x]="YES";
			}
			else{
				result[x]="NO";
			}
			x++;
			c--;
		}
		
		for(i=0;i<result.length;i++)
			System.out.println(result[i]);
	}
}
