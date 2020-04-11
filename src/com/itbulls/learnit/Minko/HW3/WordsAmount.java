package com.itbulls.learnit.Minko.HW3;

import java.io.*;

/* 
 * HomeWork ¹3 "Methods"
 * program for searching amount of words
 * dev Alexander Minko 09.02.2020
 */

public class WordsAmount {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your text here: ");
		String[] text = reader.readLine().split(" ");
		wordsAmount(text);
	}
	
	public static void wordsAmount(String[] arr) {
		System.out.println("Amount of words in the text is: " + arr.length);
	}
}
