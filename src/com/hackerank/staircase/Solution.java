package com.hackerank.staircase;

import java.util.Scanner;

public class Solution {

	
	static void staircase(int n) {
		for (int i = 0; i < n; i++) {
             System.out.print("");
			for (int j = 0; j < n && j == n -i -1; j++) {
				System.out.print("#");
			}
		}
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

		staircase(n);
	}
}