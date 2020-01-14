package hr.Strings;

import java.util.Scanner;

public class BinaryString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),count=0;
        String str=in.next();
        
//        str=str.substring(0,n);
//        String substr="010";
//        while(str.contains(substr))
//        	if(str.contains(substr)){
//        		str=str.replaceFirst(substr, "011");
//        		count+=1;
////        		System.out.println(str);
//        	}
//        
//        System.out.println(count);
        
        //Alternative Answer..
        
        System.out.println((str.length() - str.replaceAll("010", "").length())/3);
    }
}
