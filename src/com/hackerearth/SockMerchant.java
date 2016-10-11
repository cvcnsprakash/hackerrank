package com.hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		int result = 0;
		Map<Integer, Integer> res = new HashMap<Integer, Integer>();
		for(int a=0; a< times;a++){
			int temp = in.nextInt();
					if(!res.keySet().contains(temp)){
						res.put(temp, 0);
					}else{
						result++;
						res.keySet().remove(temp);
					}	
		}
		
		System.out.println(result);
		
	}

}
