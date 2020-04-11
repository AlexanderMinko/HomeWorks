package com.itbulls.learnit.Minko.HW2;

import java.io.*;

/*
 * HomeWork ¹2 "Control Statements"
 * program for separating digit
 * dev Alexander Minko 03.02.2020
 */

public class HW2separator {
	public static void main(String[] args) throws IOException {
		separatedDigits();
	}

	public static void separatedDigits() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number for separating, Nigga: ");
		try {
			String s = reader.readLine();
			int digit = Integer.parseInt(s);
			int d = 1;
			int[] digits = new int[s.length()];
			for (int i = 0; i < digits.length; i++) {
				digits[i] = ((digit / d) % 10);
				d = d * 10;
			}
			for (int i = digits.length - 1; i >= 0; i--) {
				System.out.println(digits[i]);
			}
		} catch (Exception e) {
			System.out.println("Hey, Nigga!I told you to enter a NUMBER!");
			System.out.println("ReRun the program and try again!");
		}
	}
}
