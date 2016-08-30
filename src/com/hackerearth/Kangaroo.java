package com.hackerearth;

import java.util.Scanner;

public class Kangaroo {
	
	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		int count = s.nextInt();	
		
		for(int a = 0 ;a<count;a++){
			determineKangaroos(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
		}
		
		
		
	}
	
	public static void determineKangaroos(int x1, int v1, int x2, int v2) {
	    int dx = x1 - x2;
	    int dv = v2 - v1;

	    if(dv == 0) {
	        System.out.println("NO");
	    } else if((dx % dv == 0) && (dx / dv > 0)) {
	        System.out.println("YES");
	    } else {
	        System.out.println("NO");
	    }
	}

}
