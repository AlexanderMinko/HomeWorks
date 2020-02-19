package com.itbulls.learnit.Minko.HW2;

import java.util.Arrays;

/* 
 * HomeWork ¹2 "Control Statements"
 * program for copying array
 * dev Alexander Minko 03.02.2020
 */

public class HW2copyrator {
	public static void main(String[] args) {
		int[] array = new int[10];
		int[] arrayCopy = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = ((int) (Math.random() * 10));
		}
		arrayCopy = Arrays.copyOf(array, 20);
		for (int i = 10; i < arrayCopy.length; i++) {
			arrayCopy[i] = arrayCopy[i - 10] * 2;
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : arrayCopy) {
			System.out.print(i + " ");
		}
	}
}
