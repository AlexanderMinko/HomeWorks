package com.itbulls.learnit.Minko.HW3;

import java.io.*;

/* 
 * HomeWork ¹3 "Methods"
 * program for searching a words with length more than three
 * dev Alexander Minko 09.02.2020
 */

public class MoreThanThree {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your words here: ");
		String[] text = reader.readLine().split(" ");
		String[] result = moreThanThree(text);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static String[] moreThanThree(String[] arr) {
		String array = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 3)
				array = array + arr[i] + " ";
		}
		String[] newArr = array.split(" ");
		return newArr;
	}
}
