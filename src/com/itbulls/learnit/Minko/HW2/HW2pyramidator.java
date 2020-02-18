package com.itbulls.learnit.Minko.HW2;

import java.io.*;

/* 
 * HomeWork ¹2 "Control Statements"
 * program for building star pyramid
 * dev Alexander Minko 03.02.2020
 */

public class HW2pyramidator {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Hey, Nigga! What heigh pyramid do u wanna build? Just enter a number right here: ");
		int h = Integer.parseInt(reader.readLine());
		for (int i = 0; i < h; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = h - 1; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Wow that's great!");
	}
}
