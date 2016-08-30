package com.hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TerribleChandru {
public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int n = reader.nextInt(); 
		List<String> input = new ArrayList<String>();
		for(int a=0; a<n ;a++){
			String s  = reader.next();
			char[] temp = s.toCharArray();
			char[] converted = new char[temp.length];
			
			int t=0;
			for(int ab=s.length()-1; ab>=0;ab--){
				
				converted[ab] = temp[t];
				t++;
			}
			input.add(new String(converted));
		}
		for (String string : input) {
			System.out.println(string);
			
		}
	}
}
