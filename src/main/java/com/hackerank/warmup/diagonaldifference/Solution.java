package com.hackerank.warmup.diagonaldifference;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the diagonalDifference function below.
	 */
	static int diagonalDifference(int[][] a) {
		/*
		 * Write your code here.
		 */
		int left = 0;
		int right = 0;
		for (int i = 0; i < a.length; i++) {
			left = left + a[i][i];
			right = right + a[i][a.length - 1 - i];
		}

		return Math.abs(left - right);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[][] a = new int[n][n];

		for (int aRowItr = 0; aRowItr < n; aRowItr++) {
			String[] aRowItems = scan.nextLine().split(" ");

			for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
				int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
				a[aRowItr][aColumnItr] = aItem;
			}
		}

		int result = diagonalDifference(a);

		bw.write(String.valueOf(result));
		bw.newLine();

		bw.close();
	}
}
