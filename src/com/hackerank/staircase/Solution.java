package com.hackerank.staircase;

public class Solution {

	static void staircase(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int m = n - 1 - i ; m < n; m++) {

				System.out.print("#");

			}
			System.out.println();
		}

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

		staircase(n);
	}
}