package hr.Strings;

import java.util.Scanner;

public class MakingAnagrams {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.next();
		String str2=sc.next();
		
		int[] str1alpha=new int[26];
		int[] str2alpha=new int[26];
		int i,j=0;
		int delCount=0;
		for(i=97;i<=122;i++){
//			System.out.print((char)i+" ");
			if(str1.contains(""+(char)i)){
				str1alpha[j]=str1.length()-str1.replaceAll(""+(char)i, "").length();
			}
			if(str2.contains(""+(char)i)){
				str2alpha[j]=str2.length()-str2.replaceAll(""+(char)i, "").length();
			}
//			System.out.println(str1alpha[j]+" "+str2alpha[j]);
			delCount+=Math.abs(str1alpha[j]-str2alpha[j]);
			j++;
			
		}
		
//		for(i=0;i<26;i++){
//			System.out.print(str1alpha[i]+" ");
//		}
//		System.out.println();
//		for(i=0;i<26;i++){
//			System.out.print(str2alpha[i]+" ");
//		}
		System.out.println("\nFinal:"+delCount);
	}
}
