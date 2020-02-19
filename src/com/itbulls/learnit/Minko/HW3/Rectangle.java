package com.itbulls.learnit.Minko.HW3;

import java.io.*;

/* 
 * HomeWork ¹3 "Methods"
 * program for building rectangle 
 * dev Alexander Minko 09.02.2020
 */

public class Rectangle {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please, enter a width of rectangle: ");
		int width = Integer.parseInt(reader.readLine());
		System.out.print("Please, enter a heigh of rectangle: ");
		int heigh = Integer.parseInt(reader.readLine());
		rectangleBulid(width, heigh);
	}

	public static void rectangleBulid(int a, int b) {
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				if (i > 0 && j > 0 && i < b - 1 && j < a - 1)
					System.out.print(" ");
				else
					System.out.print("+");
			}
			System.out.println();
		}
	}
}
