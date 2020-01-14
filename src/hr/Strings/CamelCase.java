package hr.Strings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int i,wordCount=1;
//        for(i=0;i<s.length();i++)
//        	if(Character.isUpperCase(s.charAt(i)))
//        		wordCount+=1;
//        System.out.println(wordCount);
        
        //Alternative Answer..
        System.out.println(s.length() - s.replaceAll("[A-Z]", "").length() + 1);
    }
}
