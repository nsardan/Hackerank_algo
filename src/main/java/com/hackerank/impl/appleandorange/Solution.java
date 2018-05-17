package com.hackerank.impl.appleandorange;

import java.util.Scanner;

public class Solution {

	// Complete the countApplesAndOranges function below.
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		// no of apples
		int fellApple = 0;
		for (int apple : apples) {
			if (apple < 0) {
				// fell on the left
			} else if (apple > 0) {
				if (a + apple >= s &&  a + apple <= t) {
					fellApple++;
				}
			}
		}
		System.out.println(fellApple);
		// no of oranges
		int fellOrange = 0;
		for (int orange : oranges) {
			if (orange > 0) {
				// fell on the right
			} else if (orange + b <= t  && orange+b >= s) {
				fellOrange++;

			}
		}
		System.out.println(fellOrange);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] st = scanner.nextLine().split(" ");

		int s = Integer.parseInt(st[0]);

		int t = Integer.parseInt(st[1]);

		String[] ab = scanner.nextLine().split(" ");

		int a = Integer.parseInt(ab[0]);

		int b = Integer.parseInt(ab[1]);

		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		int[] apple = new int[m];

		String[] appleItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			int appleItem = Integer.parseInt(appleItems[i]);
			apple[i] = appleItem;
		}

		int[] orange = new int[n];

		String[] orangeItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int orangeItem = Integer.parseInt(orangeItems[i]);
			orange[i] = orangeItem;
		}

		countApplesAndOranges(s, t, a, b, apple, orange);

		scanner.close();
	}
}
