package com.hackerank.warmup.plusminus;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the plusMinus function below.
	 */
	static void plusMinus(int[] arr) {
		BigDecimal decimal;
		float n = arr.length;
		float negatives = 0;
		float positives = 0;
		float zeros = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positives++;
			}
			if (arr[i] < 0) {
				negatives++;
			}
			if (arr[i] == 0) {
				zeros++;
			}
		}

		decimal = new BigDecimal(positives / n).setScale(6, BigDecimal.ROUND_HALF_UP);
		System.out.println(decimal);
		decimal = new BigDecimal(negatives / n).setScale(6, BigDecimal.ROUND_HALF_UP);
		System.out.println(decimal);
		decimal = new BigDecimal(zeros / n).setScale(6, BigDecimal.ROUND_HALF_UP);
		System.out.println(decimal);

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

		int[] arr = new int[n];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < n; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		plusMinus(arr);
	}
}