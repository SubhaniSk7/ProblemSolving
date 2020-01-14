package hr.Strings;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		String msg=sc.next();
		int i,count=0;
		for(i=0;i<msg.length();i=i+3){
			
			if(!msg.substring(i,i+3).equals("SOS")){
				
				if(!msg.substring(i,i+1).equals("S")){
					count+=1;
				}
				if(!msg.substring(i+1,i+2).equals("O")){
					count+=1;
				}
				if(!msg.substring(i+2,i+3).equals("S")){
					count+=1;
				}
			}
		}
		
		System.out.println(count);
	}
}
