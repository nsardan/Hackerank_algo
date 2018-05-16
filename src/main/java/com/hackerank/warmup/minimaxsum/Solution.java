package com.hackerank.warmup.minimaxsum;

import java.util.Scanner;
import java.util.*;
import java.math.*;

public class Solution {

	static void miniMaxSum(int[] arr) {

		List<BigInteger> bigList = new ArrayList<>();
		for (int i : arr) {
			bigList.add(BigInteger.valueOf(i));
		}

		Comparator<BigInteger> comparator = new Comparator<BigInteger>() {

			@Override
			public int compare(BigInteger o1, BigInteger o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		final BigInteger min = bigList.stream().min(comparator).get();
		final BigInteger max = bigList.stream().max(comparator).get();
		
		
		if(min == max) {
			System.out.print(min.multiply(BigInteger.valueOf(bigList.size() - 1)));
			System.out.print(" ");
			System.out.print(min.multiply(BigInteger.valueOf(bigList.size() - 1)));
		}else {
			System.out.print(bigList.stream().filter(i -> !i.equals(max)).reduce(BigInteger.ZERO, BigInteger::add));
			System.out.print(" ");
			System.out.print(bigList.stream().filter(i -> !i.equals(min)).reduce(BigInteger.ZERO, BigInteger::add));
		}

	
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < 5; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		miniMaxSum(arr);
	}
}