package com.hackerank.impl.gradingstudents;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {
		List<Integer> listGrades = new ArrayList<>();
		for (int grade : grades) {
			
			 
			int finalGrade = grade;
			int nextMultipleof5 = grade%5 != 0? ((grade/5) * 5)+5: grade;
			
			if (grade >= 38) {
				if (nextMultipleof5 - grade < 3) {
					finalGrade = nextMultipleof5;
				}
				listGrades.add(finalGrade);
			} else {
				listGrades.add(grade);
			}
		}

		return listGrades.stream().mapToInt(Integer::intValue).toArray();
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(scan.nextLine().trim());
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			System.out.print(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				System.out.println();
			}
		}

		System.out.println();

	}
}