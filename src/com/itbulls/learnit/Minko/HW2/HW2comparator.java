package com.itbulls.learnit.Minko.HW2;

import java.io.*;
import java.util.Arrays;

/* 
 * HomeWork ¹2 "Control Statements"
 * program for sorting string array by length
 * dev Alexander Minko 03.02.2020
 */
public class HW2comparator {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] words = new String[7];
		System.out.println("Enter 7 words: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = reader.readLine();
		}
		sort(words);
		System.out.println(Arrays.toString(words));
	}

	public static void sort(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (compare(arr[i], arr[j])) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static boolean compare(String a, String b) {
		if (a.length() > b.length())
			return true;
		else 
			return false;
	}
}
