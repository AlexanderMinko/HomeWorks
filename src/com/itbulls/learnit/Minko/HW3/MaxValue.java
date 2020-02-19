package com.itbulls.learnit.Minko.HW3;

import java.io.*;

/* 
 * HomeWork ¹3 "Methods"
 * program for searching a maximum value of array
 * dev Alexander Minko 09.02.2020
 */

public class MaxValue {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] stringArr = reader.readLine().split(" ");
		int[] parseStringArr = new int[stringArr.length];
		for (int i = 0; i < parseStringArr.length; i++) {
			parseStringArr[i] = Integer.parseInt(stringArr[i]);
		}
		System.out.println("Max value in this array is: " + maxValue(parseStringArr));

	}

	public static int maxValue(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}
}