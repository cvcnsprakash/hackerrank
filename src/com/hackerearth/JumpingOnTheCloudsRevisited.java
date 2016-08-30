package com.hackerearth;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		int k = s.nextInt();
		int cal =100;
		int arr[] = new int[length];
		for(int a=0;a<length;a++){
			arr[a] = s.nextInt();
		}
		int count=0;
		for(int x=k;x<=length;x+=k,count++){
			if(arr[x%length] == 1){
				cal-=3;
			}else{
				cal-=1;
			}
		}
		
		System.out.println(cal);
		
		
	}

}
