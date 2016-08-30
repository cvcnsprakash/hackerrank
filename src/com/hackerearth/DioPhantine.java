package com.hackerearth;

import java.util.Scanner;

public class DioPhantine {
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		
		for(int a=0; a<count; a++){
			StringBuilder sb = new StringBuilder();
			int toProcess = in.nextInt();
			int y= toProcess;
			if(y %3 !=0){
				y-=5;	
			}
			
			if(y <0  && y==toProcess){
			sb.append("-1");
			}else {
				for(int x=0;x<y;x++){
					sb.append("5");
				}
				for(int z=0;z<(toProcess -y);z++){
					sb.append("3");
				}
			}
			
			System.out.println(sb.toString());
		}
		
		
	}

}
