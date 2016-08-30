package com.hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonDivisibleSubset {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt();
		
		Map<Integer, Integer> remaninderMap = new HashMap<>();
		
		
		for(int a=0;a<n;a++){
			int remainder = s.nextInt() % k;
			remaninderMap.compute(remainder, (key,value) ->  (value==null || key ==0)  ?  1   :  (value+1) );
		}
		
       int output = remaninderMap.getOrDefault(0,0);
       
       int i=1;
       
       for(; i*2 <k;i++){
    	   output+= Math.max(remaninderMap.getOrDefault(i,0), remaninderMap.getOrDefault(k-i,0));
       }
		
       
       if(2*i ==k){
    	   output+=1;
       }
       System.out.println(output);
		s.close();
		
		

	}

}
