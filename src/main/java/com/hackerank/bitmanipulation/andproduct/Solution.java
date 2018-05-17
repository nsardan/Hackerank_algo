package com.hackerank.bitmanipulation.andproduct;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the andProduct function below.
	static long andProduct(long a, long b) {
		// b >= a
		// n between 1 to 200 inclusive
		// bitwise and remains changed with & with itself
		long ans = a;
		long count = a;
		while (count < b) {
			ans = ans & (count + 1);
			count++;
		}

		return ans;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int nItr = 0; nItr < n; nItr++) {
			String[] ab = scanner.nextLine().split(" ");

			long a = Long.parseLong(ab[0]);

			long b = Long.parseLong(ab[1]);

			long result = andProduct(a, b);

			System.out.println(String.valueOf(result));
		}

		scanner.close();
	}
}