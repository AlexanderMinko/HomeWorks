package com.itbulls.learnit.Minko.HW2;

import java.io.*;

/*
 * HomeWork ¹2 "Control Statements"
 * program for rotating matrix
 * dev Alexander Minko 05.02.2020
 */

public class HW2rotator {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double[][] matrix = new double[5][5];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (i + 1) + 0.1 * (j + 1);
			}
		}
		sout(matrix);
		System.out.println();
		System.out.println("Hi, Neo. How much do u wanna rotate matrix?");
		for (int i = 1; i <= 3; i++) {
			System.out.println("Press " + i + " to rotate matrix to " + i * 90 + " degrees");
		}
		System.out.println("Enter ur number rigth here: ");
		int n = Integer.parseInt(reader.readLine());
		if (n == 1) {
			sout(rotating(matrix));
		}
		if (n == 2) {
			sout(rotating(rotating(matrix)));
		}
		if (n == 3) {
			sout(rotating(rotating(rotating(matrix))));
		}
		if (n != 3 && n != 2 && n != 1) {
			System.out.println("What are u doing? U should to press 1 or 2 or 3!");
			System.out.println("ReRun program and try again!");
		}

	}

	public static double[][] rotating(double[][] arr) {
		double[][] rot = new double[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				rot[i][j] = arr[arr.length - j - 1][i];
			}
		}
		return rot;
	}

	public static void sout(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
