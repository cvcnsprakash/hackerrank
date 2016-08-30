package com.hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int tot = reader.nextInt(); 
		List<String> output = new ArrayList<String>();
		for(int a=0; a<tot ;a++){
			char[] charArray = reader.next().toCharArray();
			int n = reader.nextInt();
			int m = reader.nextInt();
			
			char[] modified = new char[charArray.length];
			int temp = m;
			
		for(int b=0;b<charArray.length;b++){
		  if(b>=n && b<=m){
			  modified[b] = charArray[temp];
			  temp--;
			  continue;
			  
	
		  }
		  modified[b] = charArray[b];
		  
		}
	
		  System.out.println(modified);
			  
		
		}
		
	}

}
