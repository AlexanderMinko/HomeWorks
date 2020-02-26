package com.itbulls.learnit.Minko.HW8nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextEditor {

	public static String myPathFile;
	public static char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u', 'y'};

	public static void main(String[] args) throws IOException {
		myPathFile = "C:\\Users\\Alexander Minko\\Desktop\\github\\myFile.txt";
		deleteExistFile(Paths.get(myPathFile), myPathFile);
		Path myFile = Files.createFile(Paths.get(myPathFile));
		List<String> list = createList();
		StringBuilder sb = toStringBuilder(list);
		Files.write(myFile, sb.toString().getBytes(), StandardOpenOption.APPEND);
		printText(myPathFile);
		System.out.println();
		System.out.println("Count of words in text is: " + countOfWords(list));
		System.out.println();
		System.out.println("Count of chars in text is: " + countOfChars(list));
		System.out.println();
		System.out.println("line number with biggest count of vowels: " + numberOfLineWithBiggestCountsOFVowels(list));

	}

	public static void deleteExistFile(Path f, String p) throws IOException {
		if (Files.exists(Paths.get(p))) {
			Files.delete(f);
		}
	}

	public static List<String> createList() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<>();
		String in;
		while (!(in = br.readLine()).equals("exit")) {
			list.add(in);
		}
		return list;
	}

	public static StringBuilder toStringBuilder(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for (String s : list) {
			sb.append(s).append(System.lineSeparator());
		}
		return sb;
	}

	public static void printText(String p) throws IOException {
		Stream<String> stream = Files.lines(Paths.get(p));
		System.out.println("Your entered words: ");
		List<String> res = stream
				.collect(Collectors.toList());
		res.forEach(System.out::println);
	}

	public static long countOfChars(List<String> list) {
		StringBuilder a = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			a.append(list.get(i));
		}
		long count = a.toString()
				.chars()
				.filter(Character::isLetter)
				.count();
		return count;
	}

	public static int countOfWords(List<String> list) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<list.size(); i++) {	
		 sb.append(list.get(i)).append(" ");
		}
		String[] newList = sb.toString().split(" ");
		count = newList.length;
		return count;
	}
	
	public static int numberOfLineWithBiggestCountsOFVowels(List<String> list) {
		int count = 0;
		List<Integer> intgr = new ArrayList<>();
		List<char[]> ch = new ArrayList<>();
		for(int i = 0; i<list.size(); i++) {
			ch.add(list.get(i).toCharArray());
		}	
		for(char[] i:ch) {
			for(int j = 0; j<i.length; j++) {
				if(isVowel(i[j])) {
					count++;	
				}				
			}
			intgr.add(count);
			count = 0;
		}		
		int max = intgr.get(0);
		for(int j = 0; j<intgr.size(); j++) {
			if(intgr.get(j)>max) {
				max = intgr.get(j);
				count = j;
			}
		}
		count +=1;
		return count;
	}
	
	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		for(char i: vowels) {
			if(c == i) {
				return true;
			}
		}
		return false;
	}
}
