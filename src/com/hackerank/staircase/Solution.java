package com.hackerank.staircase;

import java.util.Scanner;

public class Solution {

	/*
	 * Complete the staircase function below.
	 */
	static void staircase(int n) {
		/*
		 * Write your code here.
		 */
		int c = n-1;
		for (int j = 0; j < n; j++) {
			if( j < c)
			{
				System.out.print("");
			}
			for (int i = j; i < n; i++) {
				System.out.println("#");
			}
		}
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

		staircase(n);
	}
}