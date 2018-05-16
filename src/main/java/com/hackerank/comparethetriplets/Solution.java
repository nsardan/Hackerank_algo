package com.hackerank.comparethetriplets;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the solve function below.
	 */
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		List<Integer> numbers = new ArrayList<>();
		int alicecount = 0;
		int bobcount = 0;

		if ((a0 - b0) > 0) {
			alicecount++;
		}

		if ((a1 - b1) > 0) {
			alicecount++;
		}

		if ((a2 - b2) > 0) {
			alicecount++;
		}

		if ((b0 - a0) > 0) {
			bobcount++;
		}

		if ((b1 - a1) > 0) {
			bobcount++;
		}

		if ((b2 - a2) > 0) {
			bobcount++;
		}

		numbers.add(alicecount);
		numbers.add(bobcount);
		return numbers.stream().mapToInt(i -> i).toArray();
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] a0A1A2 = scan.nextLine().split(" ");

		int a0 = Integer.parseInt(a0A1A2[0].trim());

		int a1 = Integer.parseInt(a0A1A2[1].trim());

		int a2 = Integer.parseInt(a0A1A2[2].trim());

		String[] b0B1B2 = scan.nextLine().split(" ");

		int b0 = Integer.parseInt(b0B1B2[0].trim());

		int b1 = Integer.parseInt(b0B1B2[1].trim());

		int b2 = Integer.parseInt(b0B1B2[2].trim());

		int[] result = solve(a0, a1, a2, b0, b1, b2);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			bw.write(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				bw.write(" ");
			}
		}

		bw.newLine();

		bw.close();
	}
}
