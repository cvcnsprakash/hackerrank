package com.hackerearth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrateekFriends {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> result = new ArrayList<String>();
		int testCase = in.nextInt();
		if (testCase >= 1 && testCase <= 10) {
			for (int t = 0; t < testCase; t++) {
				String resultY = "NO";
				int friends = in.nextInt();

				int money = in.nextInt();
				if (friends >= 1 && money <= 1000000000000L) {
					int cost[][] = new int[testCase][friends];
					for (int i = 0; i < friends; i++) {
						cost[t][i] = in.nextInt();
						if(cost[t][i]>1000000){
							
						}
					}
					for (int i = 0; i < friends; i++) {
						int total = 0;
						total = total + cost[t][i];
						if (total == money) {
							resultY = "YES";
							result.add(resultY);
							break;
						}
						for (int j = i + 1; j < friends; j++) {
							total = total + cost[t][j];
							if (total == money) {
								resultY = "YES";
								result.add(resultY);
								break;
							}
						}
						if (resultY.equals("YES")) {
							break;
						}
					}
					if (resultY.equals("NO")) {
						result.add("NO");
					}

				} else {
					return;
				}
			}
			Iterator<String> it = result.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		} else {
			return;
		}
	}

}
