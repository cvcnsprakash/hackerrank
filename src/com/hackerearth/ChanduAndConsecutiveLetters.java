package com.hackerearth;

import java.util.Scanner;

public class ChanduAndConsecutiveLetters {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int n = reader.nextInt(); 
		String result = "";
		for(int a=0; a<n ;a++){
			String s = reader.next();
			s += " ";
			
			for(int ab=0; ab<s.length()-1;ab++){
				char t1 = s.charAt(ab);
				char t2 = s.charAt(ab + 1);
				
				if(t1 != t2){
					result += t1;
				}
			}
			result += "\n";
			
		}
		System.out.println(result);
		
	}

}
